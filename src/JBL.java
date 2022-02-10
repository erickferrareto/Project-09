public class JBL {
    public static void main(String[] args) {
        FoneDeOuvido jbl = new FoneDeOuvido();
        jbl.setConfort(false);
        jbl.setColor("azul bebe");
        jbl.setButtons(4);

        jbl.confortavel();
        jbl.botão();
        jbl.cor();

        System.out.println("-------------------");
    }
}
