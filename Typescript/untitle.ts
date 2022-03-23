/*class Person{
    private lastname : string;
    private firstname: string;
    constructor(firstname:string,lastname:string)
    {
this.firstname=firstname;
this.lastname=lastname;
    }*/



class Admin extends Person{}
class Manager extends Person{}

let admin = new Admin("Jyothi","Reddy");

admin.getname();