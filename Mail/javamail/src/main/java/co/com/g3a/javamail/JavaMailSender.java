package co.com.g3a.javamail;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class JavaMailSender extends JFrame {

	private JPanel contentPane;
	private JTextField deTextField;
	private JTextField paraTextField;
	private JTextField asuntoTextField;
	private JTextField hostTextField;
	private JTextField puertoTextField;
	private JTextField usuarioTextField;
	private JPasswordField passwordField;

	private JLabel lblUsuario;
	private JLabel lblPassword;

	private JCheckBox chckbxAuth;
	private JCheckBox chckbxStarttls;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaMailSender frame = new JavaMailSender();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JavaMailSender() {
		setResizable(false);
		setTitle("JavaMail Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 683, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblDe = new JLabel("De:");

		JLabel lblPara = new JLabel("Para:");

		deTextField = new JTextField();
		deTextField.setColumns(10);

		paraTextField = new JTextField();
		paraTextField.setColumns(10);

		JLabel lblAunto = new JLabel("Asunto:");

		asuntoTextField = new JTextField();
		asuntoTextField.setColumns(10);

		final JTextArea mensajeTextArea = new JTextArea();
		final JTextArea errorsTextArea = new JTextArea();
		errorsTextArea.setVisible(false);
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					errorsTextArea.setVisible(false);

					MimeMessage msg = new MimeMessage(getSession());
					// set message headers
					msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
					msg.addHeader("format", "flowed");
					msg.addHeader("Content-Transfer-Encoding", "8bit");
					msg.setFrom(new InternetAddress(deTextField.getText()));
					msg.setSubject(asuntoTextField.getText(), "UTF-8");
					msg.setText(mensajeTextArea.getText(), "UTF-8");
					msg.setSentDate(new Date());
					msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(paraTextField.getText(), false));
					errorsTextArea.setVisible(true);
					errorsTextArea.setText("Mensaje listo");
					Transport.send(msg);
					errorsTextArea.setText("EMail enviado exitosamente!!");
				} catch (MessagingException e) {
					errorsTextArea.setText(e.getMessage());
					errorsTextArea.setVisible(true);
				}
			}
		});

		JLabel lblHost = new JLabel("Host:");

		JLabel lblPuerto = new JLabel("Puerto:");

		hostTextField = new JTextField();
		hostTextField.setColumns(10);

		puertoTextField = new JTextField();
		puertoTextField.setColumns(10);

		lblUsuario = new JLabel("Usuario:");

		usuarioTextField = new JTextField();
		usuarioTextField.setColumns(10);

		lblPassword = new JLabel("Contrase\u00F1a:");

		passwordField = new JPasswordField();
		passwordField.setColumns(10);

		chckbxAuth = new JCheckBox("Auth");
		chckbxAuth.addItemListener(new CheckboxItemListener());

		chckbxStarttls = new JCheckBox("Starttls");

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane
				.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(
								gl_contentPane.createSequentialGroup().addGap(33).addGroup(gl_contentPane
										.createParallelGroup(Alignment.TRAILING, false).addGroup(
												gl_contentPane.createParallelGroup(Alignment.LEADING, false)
														.addComponent(lblDe).addComponent(
																lblPara)
														.addComponent(lblHost)
														.addComponent(lblAunto, Alignment.TRAILING))
										.addComponent(lblPuerto)).addGap(18)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(errorsTextArea, GroupLayout.DEFAULT_SIZE, 555,
														Short.MAX_VALUE)
												.addComponent(mensajeTextArea, GroupLayout.DEFAULT_SIZE, 555,
														Short.MAX_VALUE)
												.addGroup(gl_contentPane.createSequentialGroup()
														.addGroup(gl_contentPane
																.createParallelGroup(Alignment.TRAILING, false)
																.addComponent(puertoTextField, Alignment.LEADING)
																.addComponent(hostTextField, Alignment.LEADING)
																.addComponent(asuntoTextField, Alignment.LEADING)
																.addComponent(paraTextField, Alignment.LEADING)
																.addComponent(deTextField, Alignment.LEADING,
																		GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))
														.addGap(35)
														.addGroup(gl_contentPane
																.createParallelGroup(Alignment.LEADING)
																.addComponent(lblUsuario).addComponent(lblPassword))
														.addGap(26)
														.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
																.addComponent(chckbxStarttls).addComponent(chckbxAuth)
																.addGroup(gl_contentPane
																		.createParallelGroup(Alignment.LEADING, false)
																		.addComponent(passwordField, Alignment.TRAILING)
																		.addComponent(usuarioTextField,
																				Alignment.TRAILING,
																				GroupLayout.DEFAULT_SIZE, 156,
																				Short.MAX_VALUE)))))
										.addGap(60))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(305).addComponent(btnEnviar)
								.addContainerGap(336, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(deTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblDe).addComponent(chckbxAuth))
						.addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(paraTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPara))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(asuntoTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAunto).addComponent(chckbxStarttls))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(hostTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblHost).addComponent(lblUsuario).addComponent(usuarioTextField,
										GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(puertoTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPuerto).addComponent(lblPassword)
								.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addComponent(mensajeTextArea, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(errorsTextArea, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 63, Short.MAX_VALUE).addComponent(btnEnviar)
						.addContainerGap()));
		contentPane.setLayout(gl_contentPane);
		activeAuthenticationArea(false);
	}

	private Session getSession() {
		Session session = null;

		Properties props = new Properties();
		props.put("mail.smtp.host", hostTextField.getText()); // SMTP Host
		props.put("mail.smtp.auth", "" + chckbxAuth.isSelected()); // Enabling SMTP Authentication
		props.put("mail.smtp.port", puertoTextField.getText()); // SMTP Port
		if (chckbxAuth.isSelected()) {
			props.put("mail.smtp.socketFactory.port", puertoTextField.getText()); // SSL Port
			props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory"); // SSL Factory Class
			props.put("mail.smtp.starttls.enable", "" + chckbxStarttls.isSelected());
			String usuario = usuarioTextField.getText();
			String password = passwordField.getText();
			Authenticator auth = new Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(usuario, password);
				}
			};
			session = Session.getDefaultInstance(props, auth);
		} else {
			session = Session.getDefaultInstance(props);

		}

		return session;
	}

	public void activeAuthenticationArea(boolean isAutentication) {
		lblUsuario.setEnabled(isAutentication);
		lblPassword.setEnabled(isAutentication);

		chckbxStarttls.setEnabled(isAutentication);

		usuarioTextField.setEnabled(isAutentication);
		passwordField.setEnabled(isAutentication);

	}

	class CheckboxItemListener implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			Object source = e.getItemSelectable();

			if (source == chckbxAuth) {
				activeAuthenticationArea(chckbxAuth.isSelected());
			}
		}
	}
}
