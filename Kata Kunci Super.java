public Student(){
super( "SomeName", "SomeAddress" );
 System.out.println("Inside Student:Constructor");
 } 
 
//Kode ini memanggil constructor kedua dari superclass terdekat(yaitu adalah Person) dan
//mengeksekusinya. Contoh kode lain ditunjukkan sebagai berikut,
public Student(){
super();
 System.out.println("Inside Student:Constructor");
 } 
//Kode ini memanggil default constructor dari superclass terdekat(yaitu Person) dan
//mengeksekusinya.
