package co.edu.uco.ucobet.ucobet_generales.application.primaryports.dto;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.helpers.TextHelper;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.helpers.UUIDHelper;

import java.util.UUID;

public class RecoverStateDTO {

    private UUID id;
    private String name;
    private CountryDTO countryDTO;

    public RecoverStateDTO(){
        setId(UUIDHelper.getDefault());
        setName(TextHelper.EMPTY);
        setCountryDTO(countryDTO);
    }

    public RecoverStateDTO(final UUID id, final String name, final CountryDTO countryDTO) {
        setId(id);
        setName(name);
        setCountryDTO(countryDTO);
    }

    public static RecoverStateDTO create(){
        return new RecoverStateDTO();
    }

    public static RecoverStateDTO create(final UUID id, final String name, final CountryDTO countryDTO){
        return new RecoverStateDTO(id, name, countryDTO);
    }

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = UUIDHelper.getDefault(id, UUIDHelper.getDefault());
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = TextHelper.applyTrim(name);
    }

    public CountryDTO getCountryDTO() {
        return countryDTO;
    }

    public void setCountryDTO(final CountryDTO countryDTO) {
        this.countryDTO = countryDTO;
    }
}
