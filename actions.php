<?php
$m = new MongoClient( 'mongodb://localhost:12345');
$info = $m->tem->users->find( array( 'name' => 'marat'));
echo json_encode( $info); 
?>