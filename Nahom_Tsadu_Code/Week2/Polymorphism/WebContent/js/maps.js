

var accordionMap = new Object();
var diagramMap = new Object();
var diagramFormatMap = new Object();
var iconMap = [];	

function initMapValues(){
	accordionMap[attributes.introduction] = "#collapseOne";
	accordionMap[attributes.overloading] = "#collapseTwo";
	accordionMap[attributes.overriding] = "#collapseThree";
	accordionMap[attributes.coercion] = "#collapseFour";
	accordionMap[attributes.inclusion] = "#collapseFive";
	accordionMap[attributes.generics] = "#collapseSix";

	diagramMap[formatModalAttribute(attributes.introduction)] = "assets/polymorphism-diagram.svg";
	diagramMap[formatModalAttribute(attributes.overloading)] = "assets/overloading-diagram.svg";
	diagramMap[formatModalAttribute(attributes.overriding)] = "assets/overriding-diagram.svg";
	diagramMap[formatModalAttribute(attributes.coercion)] = "assets/coercion-diagram.svg";
	diagramMap[formatModalAttribute(attributes.inclusion)] = "assets/coercion-diagram.svg";
	diagramMap[formatModalAttribute(attributes.generics)] = "assets/coercion-diagram.svg";

	diagramFormatMap[formatModalAttribute(attributes.introduction)] = "7vh";
	diagramFormatMap[formatModalAttribute(attributes.overloading)] = "7vh";
	diagramFormatMap[formatModalAttribute(attributes.overriding)] = "0vh";
	diagramFormatMap[formatModalAttribute(attributes.coercion)] = "7vh";
	diagramFormatMap[formatModalAttribute(attributes.inclusion)] = "7vh";
	diagramFormatMap[formatModalAttribute(attributes.generics)] = "7vh";

	iconMap[0] = formatButtonIconAttribute(attributes.introduction);
	iconMap[1] = formatButtonIconAttribute(attributes.overloading);
	iconMap[2] = formatButtonIconAttribute(attributes.overriding);
	iconMap[3] = formatButtonIconAttribute(attributes.coercion);
	iconMap[4] = formatButtonIconAttribute(attributes.inclusion);
	iconMap[5] = formatButtonIconAttribute(attributes.generics);
}

function initMaps(){
	initMapValues();
	map = getAccordionMap();
	diagramMap = getDiagramMap();
	diagramFormat = getDiagramFormatMap();
	iconMap = getIconMap();
}

function getAccordionMap(){
	return accordionMap;
}

function getDiagramMap(){
	return diagramMap;
}

function getDiagramFormatMap(){
	return diagramFormatMap;
}

function getIconMap(){
	return iconMap;
}