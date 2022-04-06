import React from "react"
import './Main.css';
import { Link, useNavigate } from "react-router-dom";
const NavManager=()=>{
  const nav=useNavigate();
  const Logout = () => { if (typeof window !== "undefined")
   { localStorage.removeItem("jwt"); nav("/") } };
  return (
    <div>  
  <section id="header">
    <div class="header container">
      <div class="nav-bar">
        <div class="brand"> 
        <h1><span>Hotel</span> Management<span> System</span></h1>
        </div>
        <div class="nav-list">
          <div class="hamburger">
            <div class="bar"></div>
          </div>
          <ul>
            <li><Link to="/InventoryView">Inventory</Link></li>
            <li><Link to="/staffview">Staff</Link></li>
            <li><Link to="/ReservationManView">Guest</Link></li>
            <li><Link to="/roomviewmanager">Room</Link></li>
            {localStorage.getItem("jwt") && (<li><a onClick={Logout}>Logout </a></li>)}
          </ul>
        </div>
      </div>
    </div>
  </section>
  </div>
  )
};
export default NavManager;