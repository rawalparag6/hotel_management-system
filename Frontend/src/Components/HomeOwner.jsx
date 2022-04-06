import React, { Fragment } from "react"
import {
  BrowserRouter,
  BrowserRouter as Router,
  Route,
  Routes
} from 'react-router-dom';
import NavOwner from "./NavOwner";
import Main from './Main';

const HomeOwner=()=>{
  return (
    <div>  
    <NavOwner/>
    <Main/>
    </div>
  )
};
export default HomeOwner;