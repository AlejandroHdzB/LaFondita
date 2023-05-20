package itt.Vista;

import java.awt.BorderLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;

public class VG {

    public String usuario;
    public int ventasActivas[] = new int[8];
    private final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private final DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
    public String fechaSistema = dateFormat.format(new Date());
    public String horaSistema = timeFormat.format(new Date());
    public static Object obj;

    public VG(String usuario) {
        this.usuario = usuario;

    }
    
    public void setPanelBase(JPanel panelNuevo, JPanel panelBase) {
        panelNuevo.setSize(panelBase.getSize());
        panelNuevo.setLocation(0, 0);

        panelBase.removeAll();
        panelBase.add(panelNuevo, BorderLayout.CENTER);
        panelBase.revalidate();
        panelBase.repaint();
    }
}
