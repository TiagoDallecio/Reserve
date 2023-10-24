import {BrowserRouter as Router, Switch, Route, Link} from 'react-router-dom'
import Home from './Pages/Home'
import Contato from './Pages/Contato'
import Empresa from './Pages/Empresa'
const name ='Reservance'

function App() {
  return (
    <Router>
      <h1>
        {name}
      </h1>
      <ul>
        <li>
          <Link to="/">Home</Link>
        </li>
        <li>
          <Link to="/Empresa">Empresa</Link>
        </li>
        <li>
          <Link to="/Contato">Contato</Link>
        </li>
      </ul>
      <Switch>
        <Route exact path="/">
          <Home />
        </Route>
        <Route path="/Empresa">
          <Empresa />
        </Route>
        <Route path="/Contato">
          <Contato />
        </Route>
      </Switch>
    </Router>
  )
}

export default App;
