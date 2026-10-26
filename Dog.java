public class Dog {
        private String ime;
        private int dob;
        private String pasmina;

        //DEFAULT KONSTRUKTOR

        public Dog(String ime, int dob, String pasmina){
            this.ime=ime;
            this.dob=dob;
            this.pasmina=pasmina;
        }

        static public void meni(){
            System.out.println("1. Dodaj novog psa\n" +
                    "2. Ispisi sve pse\n" +
                    "3. Usvoji psa\n" +
                    "4. Izlaz ");
        }

        //GETTERI
        public String getIme(){ return ime; };
        public int getDob(){ return  dob; };
        public String getPasmina(){ return pasmina; };
        //SETTERI
        public void setIme(String novoIme){
            ime=novoIme;
        }
        public void setDob(int novaDob){
            dob=novaDob;
        }
        public void setPasmina(String novaPasmina){
            pasmina=novaPasmina;
        }

        public void ispis(){
            System.out.println("Ime= "+getIme());
            System.out.println("Dob= "+getDob());
            System.out.println("Pasmina= "+getPasmina());
        }
}
