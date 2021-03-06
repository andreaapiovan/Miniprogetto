import java.awt.Color;
import javax.swing.JOptionPane;
/**
 *
 * @author Andrea Piovan
 */
public final class SoulQuiz extends javax.swing.JFrame {
    
    private String nome, cognome;
    private int classe;
    
    private int i=0;
    
    /**
     * Variabili per gli stati dei bottoni, acceso
     * vale true, spento vale false
     */
    private boolean statoMai=false;
    private boolean statoQualcheVolta=false;
    private boolean statoSpesso=false;
    private boolean statoSempre=false;
    
    /**
     * Varibaili per la somma dei punti e da mettere nel
     * grafico per la stampa finale
     */
    private int sommaA=0;
    private int sommaB=0;
    private int sommaC=0;
    private int sommaD=0;
    private int sommaE=0;
    private int sommaF=0;

    private String[][] quiz=new String[36][2];
    private DatoCaratteristiche[] dato=new DatoCaratteristiche[36];
    private String[] aux=new String[15]; //Per tener salvate le classi
    
    public SoulQuiz() {
        initComponents();
        //Da inizializzare all'inizio del programma
        classi();
        Domande();
        lblDomanda.setText(quiz[0][0]);
    }
    
    /**
     * Metodo per settare le domande da successivamente da stampare
     */
    public void Domande(){
        quiz[0][0]="Comincio tante cose diverse senza portarle a termine";
        quiz[0][1]="A";
        quiz[1][0]="Mi sento a mio agio nella confusione e nel disordine";
        quiz[1][1]="C";
        quiz[2][0]="Vivo le mie esperienze con serenità";
        quiz[2][1]="D";
        quiz[3][0]="Conoscere altri punti di vista mi arricchisce";  
        quiz[3][1]="E";
        quiz[4][0]="Imparare delle cose che non mi servono concretamente mi sembra inutile";
        quiz[4][1]="E";
        quiz[5][0]="Mi impegno a fondo nelle cose che faccio";
        quiz[5][1]="A";
        quiz[6][0]="Preferisco non dare troppa confidenza agli altri";
        quiz[6][1]="B";
        quiz[7][0]="Quando ho finito una cosa non perdo tempo a chiedermi se l'ho fatta bene";
        quiz[7][1]="C";
        quiz[8][0]="Mi interesso a culture/civiltà diverse dalla mia";
        quiz[8][1]="E";
        quiz[9][0]="Se una cosa mi sembra difficile preferisco lasciar perdere";
        quiz[9][1]="F";
        quiz[10][0]="Affronto ogni compito con desiderio e decisione";
        quiz[10][1]="A";
        quiz[11][0]="Lavorare in gruppo rallenta il raggiungimento dei miei obbiettivi";
        quiz[11][1]="B";
        quiz[12][0]="Mi piace scoprire modi diversi di risolvere i problemi";
        quiz[12][1]="E";
        quiz[13][0]="Nella maggior parte delle situazioni mi sento sicuro/a di me stesso/a";
        quiz[13][1]="F";
        quiz[14][0]="Di fronte agli ostacoli preferisco rinunciare e cambiare impegno";
        quiz[14][1]="A";
        quiz[15][0]="Sono sempre pronto/a a dare una mano a chi ha bisogno";
        quiz[15][1]="B";
        quiz[16][0]="Per fare le cose ho bisogno di ordine e metodo";
        quiz[16][1]="C";
        quiz[17][0]="So controllare il mio comportamento di fronte agli altri";
        quiz[17][1]="D";
        quiz[18][0]="Sono felice della persona che sono";
        quiz[18][1]="F";
        quiz[19][0]="Mi trovo a disagio quando le cose non vanno subito per il verso giusto";
        quiz[19][1]="A";
        quiz[20][0]="MI piace lavorare insieme ad altre persone";
        quiz[20][1]="B";
        quiz[21][0]="Mi faccio coinvolgere troppo da quello che mi succede";
        quiz[21][1]="D";
        quiz[22][0]="Credo che per ogni persona ci sia una sola soluzione";
        quiz[22][1]="E";
        quiz[23][0]="Sono spesso indiceso/a, perplesso/a e non so come comportarmi";
        quiz[23][1]="F";
        quiz[24][0]="Mi concentro fino alla fine su quello che sto facendo";
        quiz[24][1]="A";
        quiz[25][0]="Mi piace fare le cose di istinto senza pensarci sopra troppo";
        quiz[25][1]="C";
        quiz[26][0]="Riesco a mantenere un certo distacco dalle situazioni in cui mi trovo";
        quiz[26][1]="D";
        quiz[27][0]="Sono attratto/a da esperienze nuove";
        quiz[27][1]="E";
        quiz[28][0]="Se potessi vorrei essere una persona diversa";
        quiz[28][1]="F";
        quiz[29][0]="Mi piace occuparmi dei problemi degli altri";
        quiz[29][1]="B";
        quiz[30][0]="Prima di fare una cosa valuto i pro e i contro";
        quiz[30][1]="C";
        quiz[31][0]="Spesso mi sento teso/a e agitato/a";
        quiz[31][1]="D";
        quiz[32][0]="Se non mi riesce una cosa continuo a riporvare";
        quiz[32][1]="F";
        quiz[33][0]="Riesco ad essere disponibile anche con chi non mi è simpatico";
        quiz[33][1]="B";
        quiz[34][0]="Considero finito un lavoro quando l'ho verificato nei minimi particolari";
        quiz[34][1]="C";
        quiz[35][0]="Perdo facilmente il controllo e mi lascio prendere la mano dalla situazione";
        quiz[35][1]="D";
    }
    
    /**
     * Metodo per tenere salvate le classi (solo per estetica)
     */
    public void classi(){
        aux[0]="5CA";
        aux[1]="5CB";
        aux[2]="5CC";
        aux[3]="5SA";
        aux[4]="5IA";
        aux[5]="5IB";
        aux[6]="5TA";
        aux[7]="5EA";
        aux[8]="5MA";
        aux[9]="5MB";
        aux[10]="5MC";
        aux[11]="5LA";
        aux[12]="5LB";
        aux[13]="5LC";
        aux[14]="5LD";
    }
    
    /**
     * Metodo per la somma dei punteggi 
     */
    public void somma(){
        for(int j=0; j<35; j++){
            if(quiz[j][1].equals("A"))
                sommaA=sommaA+dato[j].getPunto();
            if(quiz[j][1].equals("B"))
                sommaB=sommaB+dato[j].getPunto();
            if(quiz[j][1].equals("C"))
                sommaC=sommaC+dato[j].getPunto();
            if(quiz[j][1].equals("D"))
                sommaD=sommaD+dato[j].getPunto();
            if(quiz[j][1].equals("E"))
                sommaE=sommaE+dato[j].getPunto();
            if(quiz[j][1].equals("F"))
                sommaF=sommaF+dato[j].getPunto();
        }
        //Colore per area A
        lblSommaA.setText(sommaA+"/24");
        if(sommaA<=10)
            lblSommaA.setForeground(Color.red);
        if(sommaA>10 && sommaA<=18)
            lblSommaA.setForeground(Color.yellow);
        else
            lblSommaA.setForeground(Color.green);
        //Colore per area B
        lblSommaB.setText(sommaB+"/24");
        if(sommaB<=10)
            lblSommaB.setForeground(Color.red);
        if(sommaB>10 && sommaB<=18)
            lblSommaB.setForeground(Color.yellow);
        else
            lblSommaB.setForeground(Color.green);
        //Colore per area C
        lblSommaC.setText(sommaC+"/24");
        if(sommaC<=10)
            lblSommaA.setForeground(Color.red);
        if(sommaC>10 && sommaC<=18)
            lblSommaC.setForeground(Color.yellow);
        else
            lblSommaC.setForeground(Color.green);
        //Colore per area D
        lblSommaD.setText(sommaD+"/24");
        if(sommaD<=10)
            lblSommaD.setForeground(Color.red);
        if(sommaD>10 && sommaD<=18)
            lblSommaD.setForeground(Color.yellow);
        else
            lblSommaD.setForeground(Color.green);
        //Colore per area E
        lblSommaE.setText(sommaE+"/24");
        if(sommaE<=10)
            lblSommaF.setForeground(Color.red);
        if(sommaE>10 && sommaE<=18)
            lblSommaE.setForeground(Color.yellow);
        else
            lblSommaE.setForeground(Color.green);
        //Colore per area F
        lblSommaF.setText(sommaF+"/24");
        if(sommaF<=10)
            lblSommaF.setForeground(Color.red);
        if(sommaF>10 && sommaF<=18)
            lblSommaF.setForeground(Color.yellow);
        else
            lblSommaF.setForeground(Color.green);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgCampo = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCognome = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        cmbClasse = new javax.swing.JComboBox<>();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        btnMai = new javax.swing.JButton();
        btnQualcheVolta = new javax.swing.JButton();
        btnSpesso = new javax.swing.JButton();
        btnSempre = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        lblNumeroDomanda = new javax.swing.JLabel();
        lblDomanda = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lblSommaA = new javax.swing.JLabel();
        lblSommaC = new javax.swing.JLabel();
        lblSommaB = new javax.swing.JLabel();
        lblSommaE = new javax.swing.JLabel();
        lblSommaD = new javax.swing.JLabel();
        lblSommaF = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        javax.swing.GroupLayout dlgCampoLayout = new javax.swing.GroupLayout(dlgCampo.getContentPane());
        dlgCampo.getContentPane().setLayout(dlgCampoLayout);
        dlgCampoLayout.setHorizontalGroup(
            dlgCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dlgCampoLayout.setVerticalGroup(
            dlgCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\Immagini per applicazione\\LogoApplicazione.png")); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Orbitron", 0, 32)); // NOI18N
        jLabel2.setText("Quiz per orientamento lavorativo");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("PROVINCIA DI CREMONA-SERVIZIO LAVORO-CENTRI PER L'IMPIEGO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(0, 80, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jLabel3.setFont(new java.awt.Font("Orbitron", 0, 20)); // NOI18N
        jLabel3.setText("NOME:");

        jLabel4.setFont(new java.awt.Font("Orbitron", 0, 20)); // NOI18N
        jLabel4.setText("COGNOME:");

        jLabel5.setFont(new java.awt.Font("Orbitron", 0, 20)); // NOI18N
        jLabel5.setText("CLASSE:");

        txtCognome.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        txtNome.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        cmbClasse.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cmbClasse.setMaximumRowCount(15);
        cmbClasse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5CA", "5CB", "5CC", "5SA", "5IA", "5IB", "5TA", "5EA", "5MA", "5MB", "5MC", "5LA", "5LB", "5LC", "5LD" }));
        cmbClasse.setSelectedIndex(-1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCognome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbClasse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txtCognome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(cmbClasse))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        btnMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ellisse rosso.png"))); // NOI18N
        btnMai.setBorderPainted(false);
        btnMai.setMaximumSize(new java.awt.Dimension(120, 120));
        btnMai.setMinimumSize(new java.awt.Dimension(120, 120));
        btnMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaiActionPerformed(evt);
            }
        });

        btnQualcheVolta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ellisse arancio.png"))); // NOI18N
        btnQualcheVolta.setBorderPainted(false);
        btnQualcheVolta.setMaximumSize(new java.awt.Dimension(120, 120));
        btnQualcheVolta.setMinimumSize(new java.awt.Dimension(120, 120));
        btnQualcheVolta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQualcheVoltaActionPerformed(evt);
            }
        });

        btnSpesso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ellisse verde morto.png"))); // NOI18N
        btnSpesso.setBorderPainted(false);
        btnSpesso.setMaximumSize(new java.awt.Dimension(120, 120));
        btnSpesso.setMinimumSize(new java.awt.Dimension(120, 120));
        btnSpesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpessoActionPerformed(evt);
            }
        });

        btnSempre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ellisse verde.png"))); // NOI18N
        btnSempre.setBorderPainted(false);
        btnSempre.setMaximumSize(new java.awt.Dimension(120, 120));
        btnSempre.setMinimumSize(new java.awt.Dimension(120, 120));
        btnSempre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSempreActionPerformed(evt);
            }
        });

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        lblNumeroDomanda.setFont(new java.awt.Font("Orbitron", 0, 20)); // NOI18N
        lblNumeroDomanda.setText("0/36");

        lblDomanda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDomanda.setText("Domanda");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("MAI");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("QUALCHE VOLTA");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("SPESSO");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setText("SEMPRE");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel25.setText("Quanto ritieni che le seguenti affermazioni ti descrivano?");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(399, 399, 399)
                .addComponent(lblNumeroDomanda)
                .addGap(111, 111, 111))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGap(301, 301, 301)
                                .addComponent(jLabel6)
                                .addGap(60, 60, 60)
                                .addComponent(jLabel10))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnQualcheVolta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnSpesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(btnSempre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel11)
                                .addGap(76, 76, 76)
                                .addComponent(jLabel12))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel25))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(lblDomanda)))
                .addContainerGap(381, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(lblDomanda)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(lblNumeroDomanda)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnQualcheVolta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSempre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSpesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addComponent(btnNext)
                        .addGap(24, 24, 24))))
        );

        jTabbedPane1.addTab("Domande", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("-Punteggio per la capacità di sapersi impeganre e la modalità per raggiungere un obbiettivo:");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel26.setText("-Punteggio per la capacità di socializzare ed essere disponibile a cooperare:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel27.setText("-Punteggio per la capacità di controllare le emozioni e l'istinto:");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel28.setText("-Punteggio per la capacità di essere flessibili e interessati alle nuove esperienze:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel29.setText("-Punteggio per la capacità di responsabilità, attenzione e precisione:");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel30.setText("-Punteggio che rappresenta la soddisfazione di sè e il grado di autonomia:");

        lblSommaA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblSommaC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblSommaB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblSommaE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblSommaD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblSommaF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel29)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28)
                            .addComponent(jLabel30))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSommaB)
                                    .addComponent(lblSommaA)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSommaF))))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(778, 778, 778)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblSommaC)
                                .addComponent(lblSommaE, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addGap(572, 572, 572)
                            .addComponent(lblSommaD))))
                .addGap(331, 331, 331))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblSommaA, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(lblSommaB, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(lblSommaC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSommaD, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSommaE, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSommaF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Esito", jPanel5);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo gmail.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo Insta.png"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo gmail.png"))); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo Insta.png"))); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo gmail.png"))); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo Insta.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Orbitron", 0, 20)); // NOI18N
        jLabel18.setText("Contatti");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel19.setText("andrea.piovan@galileo.galileicrema.it");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel20.setText("luca.garlappi@galileo.galileicrema.it");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel21.setText("federico.fischetti@galileo.galileicrema.it");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel22.setText("@garlappiluca");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel23.setText("@andreaapiovan");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel24.setText("@fischetti_federico");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addContainerGap(157, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel18)
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel19)))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(jLabel16))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel20)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel8)))
                    .addComponent(jLabel24)
                    .addComponent(jLabel21))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Contatti", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        int punto=0, flag=0;
        if(i==0){
            nome=txtNome.getText();
            cognome=txtCognome.getText();
            classe=cmbClasse.getSelectedIndex();
            if(nome!=null && cognome!=null && classe!=-1){
                //Blocco dei campi
                txtNome.setEditable(false);
                txtCognome.setEditable(false);
                cmbClasse.removeAllItems();
                cmbClasse.addItem(aux[classe]);
            }
            else{
                flag++;
                JOptionPane.showMessageDialog   (jPanel2,
                                                "Compliare tutti i campi", 
                                                "ERRORE", 
                                                JOptionPane.ERROR_MESSAGE);
            }
        }
        if(flag==0 && i<35){
            if(statoMai!=false || statoQualcheVolta!=false || 
                    statoSpesso!=false || statoSempre!=false){
                if(i<35){
                    if(statoMai==true)
                        punto=1;
                    if(statoQualcheVolta==true)
                        punto=2;
                    if(statoSpesso==true)
                        punto=3;
                    if(statoSempre==true)
                        punto=4;
            
                    dato[i]=new DatoCaratteristiche(quiz[i][1],punto, quiz[i][0]);
                    i++;
                    lblDomanda.setText(quiz[i][0]);
                    Reset();
                    lblNumeroDomanda.setText(i+"/35");
                }
                if(i==35){
                    lblDomanda.setText("FINE QUIZ, GUARDARE I RISULTATI");
                    if(statoMai==true)
                        punto=1;    
                    if(statoQualcheVolta==true)
                        punto=2;
                    if(statoSpesso==true)
                        punto=3;
                    if(statoSempre==true)
                        punto=4;
                    dato[i]=new DatoCaratteristiche(quiz[i][1],punto, quiz[i][0]);
                    i++;
                    //Punteggi da stampare e poi mettere nella tabella
                    somma();
                }
                if(i==36){
                    JOptionPane.showMessageDialog   (jPanel4,
                                                    "Guardare l'esito", 
                                                    "ATTENZIONE", 
                                                    JOptionPane.INFORMATION_MESSAGE); 
                }
            }
            else{
                 JOptionPane.showMessageDialog   (jPanel4,
                                                "Scegliere un bottone", 
                                                "ERRORE", 
                                                JOptionPane.ERROR_MESSAGE);   
            }
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnSempreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSempreActionPerformed
        Reset();
        statoSempre=true;
        btnSempre.setBackground(Color.decode("#00ff00"));
    }//GEN-LAST:event_btnSempreActionPerformed

    private void btnSpessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpessoActionPerformed
        Reset();
        statoSpesso=true;
        btnSpesso.setBackground(Color.decode("#3eb53e"));
    }//GEN-LAST:event_btnSpessoActionPerformed

    private void btnQualcheVoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQualcheVoltaActionPerformed
        Reset();
        statoQualcheVolta=true;
        btnQualcheVolta.setBackground(Color.decode("#e67804"));
    }//GEN-LAST:event_btnQualcheVoltaActionPerformed

    private void btnMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaiActionPerformed
        Reset();
        statoMai=true;
        btnMai.setBackground(Color.decode("#f71b1b"));
    }//GEN-LAST:event_btnMaiActionPerformed

    /**
     * Metodo per azzerare tutti i bottoni e sistemare tutti i colori
     */
    public void Reset(){
        statoQualcheVolta=false;
        statoMai=false;
        statoSpesso=false;
        statoSempre=false;
        
        btnMai.setBackground(Color.decode("#f0f0f0"));
        btnQualcheVolta.setBackground(Color.decode("#f0f0f0"));
        btnSpesso.setBackground(Color.decode("#f0f0f0"));
        btnSempre.setBackground(Color.decode("#f0f0f0"));
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SoulQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SoulQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SoulQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SoulQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SoulQuiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMai;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnQualcheVolta;
    private javax.swing.JButton btnSempre;
    private javax.swing.JButton btnSpesso;
    private javax.swing.JComboBox<String> cmbClasse;
    private javax.swing.JDialog dlgCampo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblDomanda;
    private javax.swing.JLabel lblNumeroDomanda;
    private javax.swing.JLabel lblSommaA;
    private javax.swing.JLabel lblSommaB;
    private javax.swing.JLabel lblSommaC;
    private javax.swing.JLabel lblSommaD;
    private javax.swing.JLabel lblSommaE;
    private javax.swing.JLabel lblSommaF;
    private javax.swing.JTextField txtCognome;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}