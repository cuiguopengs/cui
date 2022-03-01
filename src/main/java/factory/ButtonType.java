package factory;

public class ButtonType {
    private String value;
    public static ButtonType PRIVATE = new ButtonType("btn_type_private");
    public static ButtonType DEFAULT = new ButtonType("btn_type_default");
    public static ButtonType DASHED = new ButtonType("btn_type_dashed");
    public static ButtonType TEXT = new ButtonType("btn_type_text");
    public static ButtonType LINKED = new ButtonType("btn_type_linked");

    public ButtonType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static ButtonType getPRIVATE() {
        return PRIVATE;
    }

    public static void setPRIVATE(ButtonType PRIVATE) {
        ButtonType.PRIVATE = PRIVATE;
    }

}
