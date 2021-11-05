$(document).ready( function () {
    var table = $('#categorizedTable').DataTable({
        "sAjaxSource": "/api/customer",
        "sAjaxDataProp": "",
        "order": [[ 0, "asc" ]],
        "aoColumns": [
            { "mData": "id"},
            { "mData": "name" },
            { "mData": "country" },
            { "mData": "countryCode" },
            { "mData": "phoneNumber" },
            { "mData": "state" }
        ]
    })
});