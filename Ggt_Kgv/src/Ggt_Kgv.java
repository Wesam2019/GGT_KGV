import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * 
 *        Die Klasse Ggt_Kgv nimmt zwei Werte ein und berechnet mit Hilfe der
 *        euklidischen Algorithmus, abhängig von der Wahl des Benutzers,
 *        entweder den größten gemeinsamen Teilers oder das kleinste gemeinsamen
 *        Vielfaches. Sobald das Ergebnis ausgegeben wird, wiederholt sich die
 *        Aufforderung zur Wahl der Art der Berechnung, nämlich ggt oder kgv,
 *        damit neue Ergebnisse ausgegeben werden können, ohne das Programm zu
 *        verlassen.
 * 
 */
public class Ggt_Kgv {

	public static void main(String[] args) {

		String con = JOptionPane.showInputDialog("Drücken Sie \"F\" zum Fortsetzen oder \"E\" zum Beenden: ");

		while (con.equalsIgnoreCase("F")) {
			if (con.equalsIgnoreCase("F")) {
				String a = JOptionPane.showInputDialog("ggt oder kgv ?");
				if (a.equalsIgnoreCase("ggt")) {

					int p = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die erste Zahl ein: "));
					int q = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die zweite Zahl ein: "));

					int r = p % q;

					String eingabe = "Sie haben " + p + " und " + q + "  eingegeben.";
					JOptionPane.showMessageDialog(null, eingabe, "Eingabe", JOptionPane.INFORMATION_MESSAGE);

					while (r != 0) {
						p = q;
						q = r;
						r = p % q;
					}

					int ggt = q;

					JOptionPane.showMessageDialog(null, ggt, "GGT", JOptionPane.INFORMATION_MESSAGE);
				}

				else if (a.equalsIgnoreCase("kgv")) {

					int p = Integer.parseInt(JOptionPane.showInputDialog("Gib die erste Zahl ein: "));
					int q = Integer.parseInt(JOptionPane.showInputDialog("Gib die zweite Zahl ein: "));
					final int d = p;
					final int b = q;

					int r = p % q;

					String eingabe = "Sie " + p + " und " + q + "  eingegeben.";
					JOptionPane.showMessageDialog(null, eingabe, "Eingabe", JOptionPane.INFORMATION_MESSAGE);

					while (r != 0) {
						p = q;
						q = r;
						r = p % q;
					}

					int ggt = q;
					int kgv = (d * b) / ggt;

					JOptionPane.showMessageDialog(null, kgv, "KGV", JOptionPane.INFORMATION_MESSAGE);
				}

				else {

					final JPanel error = new JPanel();
					JOptionPane.showMessageDialog(error, " Fehler ", " Ich verstehe nur ggt oder kgv",
							JOptionPane.ERROR_MESSAGE);

				}
			} else {
				JOptionPane.showMessageDialog(null, 0, "Programm wird beendet", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
		}

	}
}
