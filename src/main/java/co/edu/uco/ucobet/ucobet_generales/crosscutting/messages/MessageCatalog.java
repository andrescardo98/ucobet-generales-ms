package co.edu.uco.ucobet.ucobet_generales.crosscutting.messages;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.exception.CrosscuttingUcobetException;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.helpers.ObjectHelper;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.messages.enumerator.MessageCategory;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.messages.enumerator.MessageCode;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.messages.enumerator.MessageType;

import java.util.HashMap;
import java.util.Map;

public class MessageCatalog {

    private static final Map<MessageCode, Message> MESSAGES = new HashMap<>();

    static {

    }

    private static final void loadMessages(){
        addMessage(Message.create(MessageCode.M0000000001, MessageType.TECHNICAL, MessageCategory.FATAL,
                "No se recibió el código de mensaje que se quería crear. No es posible continuar con " +
                        "el proceso..."));

        addMessage(Message.create(MessageCode.M0000000002, MessageType.TECHNICAL, MessageCategory.FATAL,
                "No existe un mensaje con el código indicado. No es posible continuar con el proceso..."));

        addMessage(Message.create(MessageCode.M0000000003, MessageType.TECHNICAL, MessageCategory.FATAL,
                "No es posible otener un mensaje con el código vacío o nulo. No es posible continuar " +
                        "con el proceso..."));

        addMessage(Message.create(MessageCode.M0000000004, MessageType.USER, MessageCategory.FATAL,
                "Se ha presentado un problema inesperado tratando de llevar a cabo la operación..."));

        addMessage(Message.create(MessageCode.M0000000005, MessageType.TECHNICAL, MessageCategory.ERROR,
                "Ya existe una ciudad con el id ingresado..."));

        addMessage(Message.create(MessageCode.M0000000006, MessageType.TECHNICAL, MessageCategory.ERROR,
                "No existe la ciudad con el id indicado"));

        addMessage(Message.create(MessageCode.M0000000007, MessageType.TECHNICAL, MessageCategory.ERROR,
                "El ID de la ciudad es nulo. Debe ingresar un valor válido."));

        addMessage(Message.create(MessageCode.M0000000008, MessageType.TECHNICAL, MessageCategory.ERROR,
                "La ciudad con el id indicado está siendo usada."));

        addMessage(Message.create(MessageCode.M0000000009, MessageType.TECHNICAL, MessageCategory.ERROR,
                "La ciudad con el id indicado está siendo usada."));

        addMessage(Message.create(MessageCode.M0000000010, MessageType.TECHNICAL, MessageCategory.ERROR,
        "El formato del nombre de la ciudad no es válido."));

        addMessage(Message.create(MessageCode.M0000000011, MessageType.TECHNICAL, MessageCategory.ERROR,
                "El nombre de la ciudad para el estado ya existe"));

        addMessage(Message.create(MessageCode.M0000000012, MessageType.TECHNICAL, MessageCategory.ERROR,
                "El nombre de la ciudad está vacío, por favor ingrese un valor válido."));

        addMessage(Message.create(MessageCode.M0000000013, MessageType.TECHNICAL, MessageCategory.ERROR,
                "El nombre de la ciudad es nulo, por favor ingresa un valor válido."));

        addMessage(Message.create(MessageCode.M0000000014, MessageType.TECHNICAL, MessageCategory.ERROR,
                "La longitud del nombre de la ciudad supera la cantidad de caracteres permitidos, "
                        + "ingrese un nombre de más de 50 caracteres."));

        addMessage(Message.create(MessageCode.M0000000015, MessageType.TECHNICAL, MessageCategory.ERROR,
                "El estado indicado para la ciudad no existe."));

        addMessage(Message.create(MessageCode.M0000000016, MessageType.TECHNICAL, MessageCategory.ERROR,
                "El valor del estado no puede ser el valor por defecto"));

        addMessage(Message.create(MessageCode.M0000000017, MessageType.TECHNICAL, MessageCategory.ERROR,
                "El ID del estado es nulo. Debe ingresar un valor válido."));

        addMessage(Message.create(MessageCode.M0000000018, MessageType.TECHNICAL, MessageCategory.ERROR,
                "La ciudad fue registrada exitosamente"));

        addMessage(Message.create(MessageCode.M0000000019, MessageType.TECHNICAL, MessageCategory.ERROR,
                "Se ha presentado un problema tratando de registrar la nueva ciudad"));

        addMessage(Message.create(MessageCode.M0000000020, MessageType.TECHNICAL, MessageCategory.ERROR,
                "Los estados han sido consultados satisfactoriamente"));

        addMessage(Message.create(MessageCode.M0000000021, MessageType.TECHNICAL, MessageCategory.ERROR,
                "Se presento un problema SQL Exception tratando de consultar el estado"));

        addMessage(Message.create(MessageCode.M0000000022, MessageType.TECHNICAL, MessageCategory.ERROR,
                "Se presento un problema tratando de llevar a cabo la consultar del estado"));

    }

    private static final void addMessage(final Message message){
        MESSAGES.put(message.getCode(), message);
    }

    public static final Message getMessage(final MessageCode code){
        if (ObjectHelper.isNull(code)){
            var userMessage = getMessageContent(MessageCode.M0000000004);
            var technicalMessage = getMessageContent(MessageCode.M0000000003);
            throw CrosscuttingUcobetException.create(userMessage, technicalMessage);
        }

        if (!MESSAGES.containsKey(code)){
            var userMessage = getMessageContent(MessageCode.M0000000004);
            var technicalMessage = getMessageContent(MessageCode.M0000000002);
            throw CrosscuttingUcobetException.create(userMessage, technicalMessage);
        }
        return MESSAGES.get(code);
    }

    public static final String getMessageContent(final MessageCode code){
        return getMessage(code).getContent();
    }
}
