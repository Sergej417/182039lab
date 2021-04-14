import './App.css';
import React, {Component} from "react";
import Kniga from '../Kniga/kniga';
import EIMTSERVICE from "../../repository/eimt-repository";

class App extends Component{

    constructor(props){
        super(props);
        this.state = {
            kniga: []
        }
    }

    render(){
        return(
            <div>
                    <Kniga kniga={this.state.kniga}/>
            </div>
        )
    }

    loadKniga = () => {
        EIMTSERVICE.fetchKniga()
            .then((data) => {
                this.setState({
                    kniga: data.data
                })
            });
    }


    componentDidMount(){
        this.loadKniga();
    }

}

export default App;
