import { DndProvider } from "react-dnd";
import { HTML5Backend } from "react-dnd-html5-backend";
import DragNDrop from "../Project/DragNDrop";

function MapaReserva(){
    return(
        
        <DndProvider backend={HTML5Backend}>
            <div>
                
            </div>
            <DragNDrop />
            
        </DndProvider>
        
    );
}

export default MapaReserva