public class caar {
String brand;
int year;

public caar(String brand,int year){
    this.brand=brand;
    this.year=year;
   }
    public void Displaycaarinfo(){
        System.out.println("caar brand:"+brand);
        System.out.println("manufacture:"+year);
        }
        public static void main(String[] args){
            caar mycaar = new caar("BMW",1995);
            mycaar.Displaycaarinfo();
        }
}