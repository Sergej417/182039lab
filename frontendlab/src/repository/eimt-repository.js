import axios from '../custom-axios/axios'

const EIMTSERVICE = {
    fetchKniga: () => {
        return axios.get("/kniga");
    }
}

export default EIMTSERVICE;