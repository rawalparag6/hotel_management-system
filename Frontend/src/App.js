import React from 'react';
import './App.css';
import {
  BrowserRouter,
  BrowserRouter as Router,
  Route,
  Routes
} from 'react-router-dom';
import InventoryView from './Components/InventoryView';
import StaffView from './Components/StaffView';
import AddInventory from './Components/AddInventory';
import Login from './Components/Login';
import Register from './Components/Register';
import HomeOwner from './Components/HomeOwner';
import HomeManager from './Components/HomeManager';
import HomeReception from './Components/HomeReception';
import ReservationAddView from './Components/ReservationAddView';
import ReservationAllView from './Components/ReservationAllView';
import DepartmentOwner from './Components/DepartmentOwner';
import StaffOwner from './Components/StaffOwner';
import InventoryOwner from './Components/InventoryOwner';
import AddStaff from './Components/Addstaff';
import Reservation from './Components/Reservation';
import RoomViewManager from './Components/RoomViewManager';
import RoomView from './Components/RoomView';
import AddRoom from './Components/AddRoom';
import RoomViewOwner from './Components/RoomViewOwner';
import NavReception from './Components/NavReception';
import ReservationManView from './Components/RegisterManView';
import AddDepartment from './Components/Adddepartment'




const App =() => {
  return (  
    <>

  
    
  <BrowserRouter>
  <Routes>
        <Route exact path="/" element={<Login/>}/>
        <Route exact path="/homereception" element={<HomeReception/>}/>
        <Route exact path="/addreservation" element={<ReservationAddView/>}/>
        <Route exact path="/reservationallview" element={<ReservationAllView/>}/>
        <Route exact path="/register" element={<Register/>}/>
        <Route exact path="/homemanager" element={<HomeManager/>}/>
        <Route exact path="/staffview" element={<StaffView/>}/>
        <Route exact path="/inventoryview" element={<InventoryView/>}/>
        <Route exact path="/homeowner" element={<HomeOwner/>}/>
        <Route exact path="/ReservationManView" element={<ReservationManView/>}/>
        <Route exact path="/staffowner" element={<StaffOwner/>}/>
        <Route exact path="/departmentowner" element={<DepartmentOwner/>}/>
        <Route exact path="/inventoryowner" element={<InventoryOwner/>}/>
        <Route exact path="/inventoryowner" element={<InventoryOwner/>}/>
        <Route exact path="/addinventory" element={<AddInventory/>}/>
        <Route exact path="/addstaff" element={<AddStaff/>}/>
        <Route exact path="/addroom" element={<AddRoom/>}/>
        <Route exact path="/roomview" element={<RoomView/>}/>
        <Route exact path="/roomviewmanager" element={<RoomViewManager/>}/>
        <Route exact path="/roomviewowner" element={<RoomViewOwner/>}/>
        <Route exact path="/adddepartment" element={<AddDepartment/>}/>
       
       

        
        
  </Routes>
  </BrowserRouter>
     
      </> 
  );

}

export default App;
