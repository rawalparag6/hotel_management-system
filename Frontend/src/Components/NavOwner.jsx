import React from "react"
import './Main.css';
import { useNavigate } from "react-router-dom";
const NavOwner=()=>{
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
            <li><a href="/departmentowner">Department</a></li>
            <li><a href="/inventoryowner">Inventory</a></li>
            <li><a href="/roomviewowner">Room</a></li>
            <li><a href="/staffowner">Staff</a></li>
            {localStorage.getItem("jwt") && (<li><a onClick={Logout}>Logout </a></li>)}
          </ul>
        </div>
      </div>
    </div>
  </section>
  </div>
  )
};
export default NavOwner;