<ul id="dropdown1" class="dropdown-content">
  <li><a href="logout.jsp">Salir</a></li>
  <li class="divider"></li>
  
</ul>
<nav>
  <div class="nav-wrapper">
    
    <ul class="right ">
      
      <!-- Dropdown Trigger -->
      <li><a class="dropdown-button" href="#!" data-activates="dropdown1"><% out.print(session.getAttribute("user")); %><i class="material-icons right">arrow_drop_down</i></a></li>
    </ul>
  </div>
</nav>