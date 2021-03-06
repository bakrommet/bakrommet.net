'use strict';

const React = require('react');
const ReactDOM = require('react-dom');
const client = require('../client');

class TeamsApp extends React.Component {

    constructor(props) {
        super(props);
        this.state = {teams: []};
    }

    componentDidMount() {
        client({method: 'GET', path: '/api/teams'}).then(response => {
            this.setState({
                teams: response.entity
            });
        });
    }

    render() {
        return (
            <TeamList teams={this.state.teams}/>
        )
    }
}

class TeamList extends React.Component{
    render() {
        var teams = this.props.teams.map(team =>
            <Team key={team.id} team={team}/>
        );
        return (
            <table>
                <tbody>
                    <tr>
                        <th>Flag</th>
                        <th>ID</th>
                        <th>Name</th>
                    </tr>
                    {teams}
                </tbody>
            </table>
    )
    }
}

class Team extends React.Component{
    render() {
        var flagClass = function(team) {
            var code = team.id.toLowerCase();
            if (code === "eng"){
                code = "fifa-" + code;
            }
            return code;
        };
        return (
            <tr>
                <td className={"flag flag-" + flagClass(this.props.team)}></td>
                <td>{this.props.team.id}</td>
                <td>{this.props.team.name}</td>
            </tr>
        )
    }
}

ReactDOM.render(
    <TeamsApp />,
    document.getElementById('react')
);
