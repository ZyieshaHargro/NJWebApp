function loadData(data) {
    const tableBody = document.querySelector('#dataTable tbody');
    tableBody.innerHTML = ''; // Clear existing data

    data.forEach(item => {
        const row = document.createElement('tr');
        row.innerHTML = `
            <td>${item.id}</td>
            <td>${item.name}</td>
            <td>${item.description}</td>
            <td>${item.value}</td>
            <td>${item.originYear}</td>
            <td>${item.audioFilePath}</td>
            <td>${item.imageFilePath}</td>
        `;
        tableBody.appendChild(row);
    });
}

window.onload = () => {
    loadData(data);
};


/*

function loadData() {
    fetch('/api/instruments')
        .then(response => response.json())
        .then(data => {
            const tableBody = document.querySelector('#dataTable tbody');
            tableBody.innerHTML = ''; // Clear existing data

            data.forEach(item => {
                const row = document.createElement('tr');
                row.innerHTML = `
                    <td>${item.name}</td>
                    <td>${item.description}</td>
                    <td>${item.val}</td>
                    <td>${item.originYear}</td>
                    <td>${item.audioFilePath ? `<a href="${item.audioFilePath}">Listen</a>` : ''}</td>
                    <td>${item.imageFilePath ? `<img src="${item.imageFilePath}" alt="${item.name}" width="50">` : ''}</td>
                `;
                tableBody.appendChild(row);
            });
        });
}

window.onload = () => {
    loadData();
};

*/