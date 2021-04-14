import React from "react";

const kniga = (props) => {
    return (
        <div className={"container mm-4 mt-5"}>
            <div className={"row"}>
                <div className={"table-responsive"}>
                    <table className={"table table-striped"}>
                        <thead>
                        <tr>
                            <th scope={"col"}>Name</th>
                            <th scope={"col"}>Author</th>
                        </tr>
                        </thead>
                        <tbody>
                        {props.kniga.map((term) => {
                            return (
                                <tr>
                                    <td>{term.name}</td>
                                    <td>{term.author}</td>
                                </tr>
                            );
                        })}
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    );


}

export default kniga;