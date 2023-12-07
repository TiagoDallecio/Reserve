import React, { useState } from 'react';
import './ExecReserva.module.css';
import MesaQuatro from '../../img/MesaQuatro.png';
import MesaDois from '../../img/MesaDois.png';
import LinkButton from '../Layout/LinkButton';
import styles from './ExecReserva.module.css'

const PictureList = [
  {
    id: 1,
    url: MesaQuatro,
    name: "Mesa para quatro"
  },
  {
    id: 2,
    url: MesaDois,
    name: "Mesa para dois"
  },
];

function ExecReserva() {
  const [selectedButton, setSelectedButton] = useState(null);

  const handleButtonClick = (id) => {
    setSelectedButton(id);
  };

  return (
    <>
      <div className="Board">
        {PictureList.map((picture) => (
          <button
            key={picture.id}
            style={{ backgroundColor: "white" }}
            onClick={() => handleButtonClick(picture.id)}
          >
            <img src={picture.url} alt={picture.id} />
          </button>
        ))}
      </div>
      {selectedButton && (
        <div className={styles.InfoPainel }
        style={{padding: '0.5em' }}>
          <p>ID: {selectedButton}</p>
          <p>Tipo: {PictureList.find(p => p.id === selectedButton)?.name}</p>
          <p>Disponivel:</p>
          <p>Espaço: Salão Principal</p>
          <p></p>
          <p></p>
          <LinkButton to="/FormsReserva" text="Reservar"/>
          <p></p>
          <p></p>

        </div>
      )}
    </>
  );
}

export default ExecReserva;
