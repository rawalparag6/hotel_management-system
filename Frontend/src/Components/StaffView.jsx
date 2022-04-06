import React from "react";
import { Link } from "react-router-dom";
import NavManager from "./NavManager";
import Staff from "./Staff";

const StaffView =()=>{
    return (
        <>
        <NavManager/>
        <a  href="/addstaff"><button className="cta">Add Staff</button></a>
        <Staff/>
        </>
    )
};
export default StaffView;
