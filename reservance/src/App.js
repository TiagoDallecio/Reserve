import {BrowserRouter as Router, Route, Link, Routes} from 'react-router-dom'
import Home from './Pages/Home'
import Contato from './Pages/Contato'
import Empresa from './Pages/Empresa'
import Navbar from './components/Layout/Navbar'
import Footer from './components/Layout/Footer'

const name ='Reservance'

function App() {
  return (
    <Router>
      <h1>
        {name}
      </h1>
      <Navbar/>
      <Routes>
        <Route exact path="/" element={<Home/>} />
        <Route exact path="/Empresa" element={<Empresa/>} />
        <Route exact path="/Contato" element={<Contato/>} />
      </Routes>
      <Footer/>
    </Router>
  )
}

export default App;
