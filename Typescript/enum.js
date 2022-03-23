var day = "monday";
var week;
(function (week) {
    week[week["sun"] = 0] = "sun";
    week[week["mon"] = 1] = "mon";
    week[week["tues"] = 2] = "tues";
    week[week["we"] = 3] = "we";
    week[week["thrus"] = 4] = "thrus";
    week[week["fri"] = 10] = "fri";
    week[week["sat"] = 11] = "sat";
})(week || (week = {}));
var days;
days = week.fri;
console.log(days);
if (days == week.fri) {
    console.log("Weeked");
}
