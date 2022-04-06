import React from "react";
import { Link } from "react-router-dom";

import Department from "./Department";
import NavOwner from "./NavOwner";

const DepartmentOwner =()=>{
    return (
        <>
        <NavOwner/>
        <a  href="/adddepartment"><button className="cta">Add Department</button></a>
       <Department/>
        </>
    )
};
export default DepartmentOwner;
