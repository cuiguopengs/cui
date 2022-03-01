package control;

import factory.ButtonType;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Button;
import utils.CResourceLoader;

public class CButton extends Button {
    private ObjectProperty<ButtonType> type = new SimpleObjectProperty();
    private static String STYLE_SHEET = "css/cButton.css";
    public CButton() {
        super();
        init();
    }


    private void init() {
        initAction();
        initStyle();
    }

    private void initStyle() {
        getStylesheets().add(CResourceLoader.load(STYLE_SHEET));
    }

    private void initAction() {
       type.addListener(new ChangeListener<ButtonType>() {
           @Override
           public void changed(ObservableValue<? extends ButtonType> observableValue, ButtonType buttonType, ButtonType t1) {
               getStyleClass().add(t1.getValue());
           }
       });
    }

    public void setType(ButtonType type) {
        this.type.set(type);
    }
}
