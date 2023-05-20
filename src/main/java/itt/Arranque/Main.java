package itt.Arranque;

//import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDarkerContrastIJTheme;
//import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMoonlightIJTheme;
import itt.Vista.InicioSesion;
import java.awt.Color;
import javax.swing.UIManager;

public class Main {

    public static void main(String args[]) {
        //Configuraciones generales
        UIManager.put("Button.hoverForeground", Color.white);
        UIManager.put("TextComponent.arc", 100);
        UIManager.put("PasswordField.echoChar", '*');
        UIManager.put("PasswordField.showRevealButton", true);

        java.awt.EventQueue.invokeLater(() -> {
            new InicioSesion().setVisible(true);
        });
    }

}
