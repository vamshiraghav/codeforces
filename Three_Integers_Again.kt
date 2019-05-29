fun main() = repeat(readLine()!!.toInt()) {
	val(x,y)=readLine()!!.split(' ').map(String::toInt)
    var mx=1;
    var mn=1;
    var z=0;
    if (x== y) {
        z=x-1;
    println("$z 1 1")
    }
    else{
    if(x>y){ mx=x;
     mn=y;}
    else{
     mx=y;
     mn=x;}
    var e=mx-mn+1;
    var f=mn-1;
    println("$e $f 1")}
    
	
}
