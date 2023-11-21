import MesaQuatro from '../../img/MesaQuatro.png'
import MesaDois from '../../img/MesaDois.png'
import PictureDND from './PictureDND'
import './DragNDrop.modules.css'
import { useState } from 'react'
import { useDrop } from 'react-dnd'

const PictureList = [
    {
        id: 1,
        url: MesaQuatro
    },
    {
        id: 2,
        url: MesaDois
    },
]


function DragNDrop(){

    const [board,setBoard] = useState([ ]);

    const [{ isOver }, drop] = useDrop(() => ({
    accept: "image",
    drop: (item) => addImageToBoard(item.id),
    collect: (monitor) => ({
        isOver: !!monitor.isOver(),
    }),

    }));

const addImageToBoard = (id) => {
    const pictureList = PictureList.filter((picture) => id === picture.id);
    setBoard((board) => [...board, pictureList[0]]);
};

    return(
        
            <>
                <div className="MesasSelect">{PictureList.map((picture) => { return <PictureDND url={picture.url} id={picture.id}/>} )}</div>
                <div className="Board" ref={drop}>{board.map((picture) => { return <PictureDND url={picture.url} id={picture.id}/>} )}</div>

            </>
        
    )
}

export default DragNDrop