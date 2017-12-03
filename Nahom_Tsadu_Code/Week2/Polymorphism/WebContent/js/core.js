/**
 * 
 */

var map;
var diagramMap;
var diagramFormat;
var iconMap;

var mainModal;
var mainModalContent;
var modalElements = [];
var introductionElements = [];
var overloadingElements = [];
var overridingElements = [];
var coercionElements = [];
var inclusionElements = [];
var genericsElements = [];

var resizeTimer;

$(document).ready(function(){
	initialize();
	console.log();
	window.addEventListener('resize', function () {
			repositionElements();
//		  clearTimeout(resizeTimer);
//		  resizeTimer = setTimeout(repositionElements, 1000);
	});
	$(mainModal).on('shown.bs.modal', function(){setModalFocus();});
	$(stringify(modalElements)).click(function(){setModalDiagram(this);});
	$("#home").click(()=>{collapseAll();});
	$(stringify(introductionElements)).click(()=>{setView(attributes.introduction, false);});
	$(stringify(overloadingElements)).click(()=>{setView(attributes.overloading, false);});
	$(stringify(overridingElements)).click(()=>{setView(attributes.overriding, false);});
	$(stringify(coercionElements)).click(()=>{setView(attributes.coercion, false);});
	$(stringify(inclusionElements)).click(()=>{setView(attributes.inclusion, false);});
	$(stringify(genericsElements)).click(()=>{setView(attributes.generics, false);});
});

function initialize(){
	initMaps();
	initModals();
	initElements([
		{elements: introductionElements, attribute: attributes.introduction},
		{elements: overloadingElements, attribute: attributes.overloading},
		{elements: overridingElements, attribute: attributes.overriding},
		{elements: coercionElements, attribute: attributes.coercion},
		{elements: inclusionElements, attribute: attributes.inclusion},
		{elements: genericsElements, attribute: attributes.generics}
	]);
}



