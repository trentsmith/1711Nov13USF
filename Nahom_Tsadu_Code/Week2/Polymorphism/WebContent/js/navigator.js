var current = null;
var previous = null;
var collapsed = true;

function myFunction(x) {
	if(x == 1) setHome();
	else if(x == 2) setIntro();
	else if(x == 3) setOverloading();
	else if(x == 4) setOverriding();
	else if(x == 5) setCoercion();
	else if(x == 6) setInclusion();
	else if(x == 7) setGenerics();
	console.log(x + ", Current: " +getCurrent());
	console.log(x + ", Previous: " +getPrevious());
}

function getCurrent(){
	return current;
}

function getPrevious(){
	return previous;
}

function isCollapsed(){
	return (collapsed == true);
}

function setCollapsed(bool){
	collapsed = bool;
}

function setHome(){
	previous = current;
	current = "home";
}

function setIntro(){
	if(current != "introduction"){
		previous = current;
		current = "introduction";
	}else{
		previous = current;
		current = null;
	}
}

function setOverloading(){
	if(current != "overloading"){
		previous = current;
		current = "overloading";
	}else{
		previous = current;
		current = null;
	}
}

function setOverriding(){
	if(current != "overriding"){
		previous = current;
		current = "overriding";
	}else{
		previous = current;
		current = null;
	}
}

function setCoercion(){
	if(current != "coercion"){
		previous = current;
		current = "coercion";
	}else{
		previous = current;
		current = null;
	}
}

function setInclusion(){
	if(current != "inclusion"){
		previous = current;
		current = "inclusion";
	}else{
		previous = current;
		current = null;
	}
}

function setGenerics(){
	if(current != "generics"){
		previous = current;
		current = "generics";
	}else{
		previous = current;
		current = null;
	}
}