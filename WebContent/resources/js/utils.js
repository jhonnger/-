function showDialogConfirm(msg,callable) {
    $('#confirm').modal({
            complete: function() { $('#confirmDel').unbind('click'); } // Callback for Modal close
        }
    );
    $('#msgModalConfirm').html(msg);
    $('#confirm').modal('open');
    $('#confirmDel').unbind('click');
        $('#confirmDel').click( function(e) {
            callable();
            $('#confirm').modal('close');
        });
}