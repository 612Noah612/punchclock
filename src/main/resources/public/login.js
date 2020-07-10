const getUser = (entry) => {
    entry.preventDefault();
    const formData = new FormData(entry.target);
    const user = {}
    user['username'] = formData.get('user');
    user['password'] = formData.get('password')


    fetch(`${URL}/login`, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(user)
    }).then((result) => {

        if(result.status === 200) {
            alert("ok");
        } else {
            alert("not ok");

        }

    });
};

document.addEventListener('DOMContentLoaded', function(){
    const entryForm = document.querySelector('#login');
    entryForm.addEventListener('submit', getUser);

});