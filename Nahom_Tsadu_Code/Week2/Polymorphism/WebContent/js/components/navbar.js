
/*
<nav class="navbar navbar-expand-lg navbar-light bg-light" style="position: fixed; min-width: 100vw; z-index: 3; height: 60px;">
 <div class="container" style="width: 620px;">
  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active" onclick="myFunction(1)">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item" id="introductionTab" onclick="myFunction(2)">
        <a class="nav-link" data-toggle="collapse" href="#collapseOne" aria-expanded="true" aria-controls="collapseOne">Introduction</a>
      </li>
      <li class="nav-item" id="overloadingTab" onclick="myFunction(3)">
        <a class="nav-link" data-toggle="collapse" href="#collapseTwo" aria-expanded="true" aria-controls="collapseTwo">Overloading</a>
      </li>
      <li class="nav-item" id="overridingTab" onclick="myFunction(4)">
        <a class="nav-link" data-toggle="collapse" href="#collapseThree" aria-expanded="true" aria-controls="collapseThree">Overriding</a>
      </li>
      <li class="nav-item" id="coercionTab" onclick="myFunction(5)">
        <a class="nav-link" data-toggle="collapse" href="#collapseFour" aria-expanded="true" aria-controls="collapseFour">Coercion</a>
      </li>
      <li class="nav-item" id="inclusionTab" onclick="myFunction(6)">
        <a class="nav-link" data-toggle="collapse" href="#collapseFive" aria-expanded="true" aria-controls="collapseFive">Inclusion</a>
      </li>
      <li class="nav-item" id="genericsTab" onclick="myFunction(7)">
        <a class="nav-link" data-toggle="collapse" href="#collapseSix" aria-expanded="true" aria-controls="collapseSix">Generics</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0" style="display:none;">
          <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
  </div>
</nav>
*/

document.write(
'\
		<nav class="navbar navbar-expand-lg navbar-light bg-light" style="position: fixed; min-width: 100vw; z-index: 3; height: 60px;">\
		 <div class="container" style="width: 620px;">\
		  <div class="collapse navbar-collapse" id="navbarSupportedContent">\
		    <ul class="navbar-nav mr-auto">\
		      <li class="nav-item" class="home" id="home" accordion-id="accordion" >\
		        <a class="nav-link" data-toggle="collapse" href="#">Home <span class="sr-only">(current)</span></a>\
		      </li>\
		      <li class="nav-item" id="introductionTab" onclick="myFunction(2)">\
		        <a class="nav-link" data-toggle="collapse" href="#collapseOne" aria-expanded="true" aria-controls="collapseOne">Introduction</a>\
		      </li>\
		      <li class="nav-item" id="overloadingTab" onclick="myFunction(3)">\
		        <a class="nav-link" data-toggle="collapse" href="#collapseTwo" aria-expanded="true" aria-controls="collapseTwo">Overloading</a>\
		      </li>\
		      <li class="nav-item" id="overridingTab" onclick="myFunction(4)">\
		        <a class="nav-link" data-toggle="collapse" href="#collapseThree" aria-expanded="true" aria-controls="collapseThree">Overriding</a>\
		      </li>\
		      <li class="nav-item" id="coercionTab" onclick="myFunction(5)">\
		        <a class="nav-link" data-toggle="collapse" href="#collapseFour" aria-expanded="true" aria-controls="collapseFour">Coercion</a>\
		      </li>\
		      <li class="nav-item" id="inclusionTab" onclick="myFunction(6)">\
		        <a class="nav-link" data-toggle="collapse" href="#collapseFive" aria-expanded="true" aria-controls="collapseFive">Inclusion</a>\
		      </li>\
		      <li class="nav-item" id="genericsTab" onclick="myFunction(7)">\
		        <a class="nav-link" data-toggle="collapse" href="#collapseSix" aria-expanded="true" aria-controls="collapseSix">Generics</a>\
		      </li>\
		    </ul>\
		    <form class="form-inline my-2 my-lg-0" style="display:none;">\
		          <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">\
		      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>\
		    </form>\
		  </div>\
		  </div>\
		</nav>\
\
'		
);