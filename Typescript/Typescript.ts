class struct{
	fname : string;
	lname : string;
	roll : number;
	bomb(){
	return this.fname+this.lname; 
}
}
var obj= new struct();
obj.fname="MR";
obj.lname="Bean";
obj.roll= 333;


//console.log(obj);
console.log(obj.fname);
console.log(obj.lname);
console.log(obj.roll);
console.log(obj.bomb());
//var tt=obj.bomb;
//console.log(tt);