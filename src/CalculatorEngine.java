import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by kfong on 6/25/2015.
 */
public class CalculatorEngine implements ActionListener {

    Calculator parent;

    public CalculatorEngine(Calculator parent) {
        this.parent = parent;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();

        String displayFieldText = parent.displayField.getText();

        String clickedButtonLabel = clickedButton.getText();

        parent.displayField.setText(displayFieldText + clickedButtonLabel);
    }
}
