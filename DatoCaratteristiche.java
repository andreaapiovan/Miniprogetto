/**
 *
 * @author Andrea Piovan
 */
public class DatoCaratteristiche {
    private String area;
    private int punto;
    private String domanda;
    
    /**
     * Costruttore vuoto
     */
    public DatoCaratteristiche(){
        area=null;
        punto=0;
        domanda=null;
    }
    
    public DatoCaratteristiche(String area, int punto, String domanda){
        this.area=area;
        this.punto=punto;
        this.domanda=domanda;
    }
    
    /**
     * Metodo per impostare l'area
     * @param area della domanda
     */
    public void setArea(String area){
        this.area=area;
    }
    
    /**
     * Metodo per impostare il punteggio
     * @param punto punteggio per ogni domanda
     */
    public void setPunto(int punto){
        this.punto=punto;
    }
    
    public void setDomanda(String domanda){
        this.domanda=domanda;
    }
    
    public String getArea(){
        return area;
    }
    
    public int getPunto(){
        return punto;
    }
    
    public String getDomanda(){
        return domanda;
    }
}


/*quiz[0][0]="Comincio tante cose diverse senza portarle a termine";
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
        quiz[35][1]="D"; */