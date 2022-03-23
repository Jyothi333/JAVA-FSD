interface PersonInterface{
    firstName : string;
    Lastname :string;
    getFullName(): string;

}
class Foo implements PersonInterface{
    firstName: string;
    Lastname: string;
    getFullName(): string {
       return this.firstName +this.Lastname;
    }
}

let someobj={
    firstName:'text',
     Lastname: 'text', getFullName: () => "text"
}