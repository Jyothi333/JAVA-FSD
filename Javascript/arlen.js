var ar=[21,43,12,1,-1];
function arlen(s)
{
	var len=0;
	while(s[len]!=undefined)
	{
		len++;
	}
	return len;
}

console.log(arlen(ar))