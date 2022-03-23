var Foo = /** @class */ (function () {
    function Foo() {
    }
    Foo.prototype.getFullName = function () {
        return this.firstName + this.Lastname;
    };
    return Foo;
}());
var someobj = {
    firstName: 'text',
    Lastname: 'text', getFullName: function () { return "text"; }
};
