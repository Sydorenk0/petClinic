$(document).ready(function () {
    var jVal = {
        "firstName": function () {
            $('body').append('<div id="firstInfo" class="info"></div>');
            var firstInfo = $('#firstInfo');
            var ele = $('#firstName');
            var pos = ele.offset();
            firstInfo.css({
                top: pos.top - 3,
                left: pos.left + ele.width() + 15
            });
            if (ele.val().length < 4) {
                jVal.errors = true;
                firstInfo.removeClass('correct').addClass('error').html('long').show();
                ele.removeClass('wrong').addClass('normal');
            } else {
                firstInfo.removeClass('error').addClass('correct').html('ok').show();
                ele.removeClass('wrong').addClass('normal');
            }
        },
        "lastName": function () {
            $('body').append('<div id="lastInfo" class="info"></div>');
            var lastInfo = $('#lastInfo');
            var ele = $('#lastName');
            var pos = ele.offset();
            lastInfo.css({
                top: pos.top - 3,
                left: pos.left + ele.width() + 15
            });
            if (ele.val().length < 4) {
                jVal.errors = true;
                lastInfo.removeClass('correct').addClass('error').html('long').show();
                ele.removeClass('wrong').addClass('normal');
            } else {
                lastInfo.removeClass('error').addClass('correct').html('ok').show();
                ele.removeClass('wrong').addClass('normal');
            }
        },
        "specializ": function () {
            $('body').append('<div id="specializInfo" class="info"></div>');
            var specializInfo = $('#specializInfo');
            var ele = $('#specializ');
            var pos = ele.offset();
            specializInfo.css({
                top: pos.top - 3,
                left: pos.left + ele.width() + 15
            });
            if (ele.val().length < 3) {
                jVal.errors = true;
                specializInfo.removeClass('correct').addClass('error').html('long').show();
                ele.removeClass('wrong').addClass('normal');
            } else {
                specializInfo.removeClass('error').addClass('correct').html('ok').show();
                ele.removeClass('wrong').addClass('normal');
            }
        },
        'sendIt': function () {
            if (!jVal.errors) {
                $('#jform').submit();
            }
        }
    };
    // _________________________

    $('#send').click(function () {
        var obj = $.browser.webkit ? $('body') : $('html');
        obj.animate({scrollTop: $('#jform').offset().top()}, 750, function () {
            jVal.errors = false;
            jVal.firstName();
            jVal.lastName();
            jVal.specializ();
            jVal.sendIt();
        });
        return false;
    });
    $('#firstName').change(jVal.firstName);
    $('#lastName').change(jVal.lastName);
    $('#specializ').change(jVal.specializ);
});
