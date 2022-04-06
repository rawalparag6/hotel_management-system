import React from "react";
import { Link } from "react-router-dom";
import NavManager from "./NavManager";
import Room from "./Room";

const StaffView =()=>{
    return (
        <>
        <NavManager/>
        <a  href="/addroom"><button className="cta">Add Room</button></a>
        <Room/>
        </>
    )
};
export default StaffView;
