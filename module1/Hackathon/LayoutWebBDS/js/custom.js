$(document).ready(function() {
	$('.chatIcon').click(function() {
		$('.chatBox').toggleClass('active');
	});

	$('.my-conv-form-wrapper').convform({selectInputStyle: 'disable'})
});
