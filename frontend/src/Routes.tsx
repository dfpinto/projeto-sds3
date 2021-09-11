import Dashboard from "Dashboard";
import Home from "Home";
import { BrowserRouter, Switch, Route } from "react-router-dom";

const Routes = () => {
    return(
        <BrowserRouter>
            <Switch>
                <Route path = "/" exact>
                    <Home></Home>
                </Route>
                <Route path = "/dashboard">
                    <Dashboard></Dashboard>
                </Route>
            </Switch>
        </BrowserRouter>
    );
}

export default Routes;