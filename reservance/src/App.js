import './App.css';
import Start from './components/Start' 
import Event from './components/Event';
import Forms from './components/Forms';

const name ='Reservance'

function App() {
  return (

    <div className="App">
      <h1>{name}</h1>
      <Event/>
      <Forms/>
    </div>
  );
}

export default App;
