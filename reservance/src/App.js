import {BrowserRouter as Router, Route, Routes} from 'react-router-dom'
import Home from './components/Pages/Home'
import Contato from './components/Pages/Contato'
import Empresa from './components/Pages/Empresa'
import CriarProjeto from './components/Pages/CriarProjeto'
import Navbar from './components/Layout/Navbar'
import Footer from './components/Layout/Footer'
import Container from './components/Layout/Container'
import MapaReserva from './components/Pages/MapaReserva'
import ExecReserva from './components/Pages/ExecReserva'
import FormsReserva from './components/Pages/FormsReserva'
import ViewReservas from './components/Pages/ViewReservas'
import Cadastro from './components/Pages/Cadastro'
import Entrar from './components/Pages/Entrar'
import Cardapio from './components/Pages/Cardapio'
import AddCardapio from './components/Pages/AddCardapio'

const name ='Reservance'

function App() {
  return (
    <Router>
      <Navbar/>

    <Container customClass="min-height">
        <Routes>
           <Route exact path="/" element={<Home/>} />
           <Route exact path="/Empresa" element={<Empresa/>} />
           <Route exact path="/Contato" element={<Contato/>} />
           <Route exact path="/CriarProjeto" element={<CriarProjeto/>} />
           <Route exact path="/AddCardapio" element={<AddCardapio/>} />
           <Route exact path="/ExecReserva" element={<ExecReserva/>} />
           <Route exact path="/FormsReserva" element={<FormsReserva/>} />
           <Route exact path="/ViewReservas" element={<ViewReservas/>} />
           <Route exact path="/Cadastro" element={<Cadastro/>} />
           <Route exact path="/Entrar" element={<Entrar/>} />
           <Route exact path="/Cardapio" element={<Cardapio/>} />
        </Routes>
    </Container>
      
    
      <Footer />
    </Router>
  )
}

export default App;
