<?hh
/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

/**
 * Original thrift service:-
 * Service
 */
interface ServiceAsyncIf extends \IThriftAsyncIf {
  /**
   * Original thrift definition:-
   * i32
   *   func(1: string arg1,
   *        2: MyStruct arg2);
   */
  public function func(string $arg1, ?MyStruct $arg2): Awaitable<int>;
}

/**
 * Original thrift service:-
 * Service
 */
interface ServiceIf extends \IThriftSyncIf {
  /**
   * Original thrift definition:-
   * i32
   *   func(1: string arg1,
   *        2: MyStruct arg2);
   */
  public function func(string $arg1, ?MyStruct $arg2): int;
}

/**
 * Original thrift service:-
 * Service
 */
interface ServiceAsyncClientIf extends ServiceAsyncIf {
}

/**
 * Original thrift service:-
 * Service
 */
interface ServiceClientIf extends \IThriftSyncIf {
  /**
   * Original thrift definition:-
   * i32
   *   func(1: string arg1,
   *        2: MyStruct arg2);
   */
  public function func(string $arg1, ?MyStruct $arg2): Awaitable<int>;
}

/**
 * Original thrift service:-
 * Service
 */
trait ServiceClientBase {
  require extends \ThriftClientBase;

  protected function sendImpl_func(string $arg1, ?MyStruct $arg2): int {
    $currentseqid = $this->getNextSequenceID();
    $args = Service_func_args::fromShape(shape(
      'arg1' => $arg1,
      'arg2' => $arg2,
    ));
    try {
      $this->eventHandler_->preSend('func', $args, $currentseqid);
      if ($this->output_ is \TBinaryProtocolAccelerated)
      {
        \thrift_protocol_write_binary($this->output_, 'func', \TMessageType::CALL, $args, $currentseqid, $this->output_->isStrictWrite(), false);
      }
      else if ($this->output_ is \TCompactProtocolAccelerated)
      {
        \thrift_protocol_write_compact($this->output_, 'func', \TMessageType::CALL, $args, $currentseqid, false);
      }
      else
      {
        $this->output_->writeMessageBegin('func', \TMessageType::CALL, $currentseqid);
        $args->write($this->output_);
        $this->output_->writeMessageEnd();
        $this->output_->getTransport()->flush();
      }
    } catch (\THandlerShortCircuitException $ex) {
      switch ($ex->resultType) {
        case \THandlerShortCircuitException::R_EXPECTED_EX:
        case \THandlerShortCircuitException::R_UNEXPECTED_EX:
          $this->eventHandler_->sendError('func', $args, $currentseqid, $ex->result);
          throw $ex->result;
        case \THandlerShortCircuitException::R_SUCCESS:
        default:
          $this->eventHandler_->postSend('func', $args, $currentseqid);
          return $currentseqid;
      }
    } catch (\Exception $ex) {
      $this->eventHandler_->sendError('func', $args, $currentseqid, $ex);
      throw $ex;
    }
    $this->eventHandler_->postSend('func', $args, $currentseqid);
    return $currentseqid;
  }

  protected function recvImpl_func(?int $expectedsequenceid = null, shape(?'read_options' => int) $options = shape()): int {
    try {
      $this->eventHandler_->preRecv('func', $expectedsequenceid);
      if ($this->input_ is \TBinaryProtocolAccelerated) {
        $result = \thrift_protocol_read_binary($this->input_, 'Service_func_result', $this->input_->isStrictRead(), Shapes::idx($options, 'read_options', 0));
      } else if ($this->input_ is \TCompactProtocolAccelerated)
      {
        $result = \thrift_protocol_read_compact($this->input_, 'Service_func_result', Shapes::idx($options, 'read_options', 0));
      }
      else
      {
        $rseqid = 0;
        $fname = '';
        $mtype = 0;

        $this->input_->readMessageBegin(
          inout $fname,
          inout $mtype,
          inout $rseqid,
        );
        if ($mtype === \TMessageType::EXCEPTION) {
          $x = new \TApplicationException();
          $x->read($this->input_);
          $this->input_->readMessageEnd();
          throw $x;
        }
        $result = Service_func_result::withDefaultValues();
        $result->read($this->input_);
        $this->input_->readMessageEnd();
        if ($expectedsequenceid !== null && ($rseqid !== $expectedsequenceid)) {
          throw new \TProtocolException("func failed: sequence id is out of order");
        }
      }
    } catch (\THandlerShortCircuitException $ex) {
      switch ($ex->resultType) {
        case \THandlerShortCircuitException::R_EXPECTED_EX:
          $this->eventHandler_->recvException('func', $expectedsequenceid, $ex->result);
          throw $ex->result;
        case \THandlerShortCircuitException::R_UNEXPECTED_EX:
          $this->eventHandler_->recvError('func', $expectedsequenceid, $ex->result);
          throw $ex->result;
        case \THandlerShortCircuitException::R_SUCCESS:
        default:
          $this->eventHandler_->postRecv('func', $expectedsequenceid, $ex->result);
          return $ex->result;
      }
    } catch (\Exception $ex) {
      $this->eventHandler_->recvError('func', $expectedsequenceid, $ex);
      throw $ex;
    }
    if ($result->success !== null) {
      $success = $result->success;
      $this->eventHandler_->postRecv('func', $expectedsequenceid, $success);
      return $success;
    }
    $x = new \TApplicationException("func failed: unknown result", \TApplicationException::MISSING_RESULT);
    $this->eventHandler_->recvError('func', $expectedsequenceid, $x);
    throw $x;
  }

}

class ServiceAsyncClient extends \ThriftClientBase implements ServiceAsyncClientIf {
  use ServiceClientBase;

  /**
   * Original thrift definition:-
   * i32
   *   func(1: string arg1,
   *        2: MyStruct arg2);
   */
  public async function func(string $arg1, ?MyStruct $arg2): Awaitable<int> {
    $hh_frame_metadata = $this->getHHFrameMetadata();
    if ($hh_frame_metadata !== null) {
      \HH\set_frame_metadata($hh_frame_metadata);
    }
    $rpc_options = $this->getAndResetOptions() ?? \ThriftClientBase::defaultOptions();
    await $this->asyncHandler_->genBefore("Service", "func");
    $currentseqid = $this->sendImpl_func($arg1, $arg2);
    $channel = $this->channel_;
    $out_transport = $this->output_->getTransport();
    $in_transport = $this->input_->getTransport();
    if ($channel !== null && $out_transport is \TMemoryBuffer && $in_transport is \TMemoryBuffer) {
      $msg = $out_transport->getBuffer();
      $out_transport->resetBuffer();
      list($result_msg, $_read_headers) = await $channel->genSendRequestResponse($rpc_options, $msg);
      $in_transport->resetBuffer();
      $in_transport->write($result_msg);
    } else {
      await $this->asyncHandler_->genWait($currentseqid);
    }
    $response = $this->recvImpl_func($currentseqid);
    await $this->asyncHandler_->genAfter();
    return $response;
  }

}

class ServiceClient extends \ThriftClientBase implements ServiceClientIf {
  use ServiceClientBase;

  /**
   * Original thrift definition:-
   * i32
   *   func(1: string arg1,
   *        2: MyStruct arg2);
   */
  public async function func(string $arg1, ?MyStruct $arg2): Awaitable<int> {
    $hh_frame_metadata = $this->getHHFrameMetadata();
    if ($hh_frame_metadata !== null) {
      \HH\set_frame_metadata($hh_frame_metadata);
    }
    $rpc_options = $this->getAndResetOptions() ?? \ThriftClientBase::defaultOptions();
    await $this->asyncHandler_->genBefore("Service", "func");
    $currentseqid = $this->sendImpl_func($arg1, $arg2);
    $channel = $this->channel_;
    $out_transport = $this->output_->getTransport();
    $in_transport = $this->input_->getTransport();
    if ($channel !== null && $out_transport is \TMemoryBuffer && $in_transport is \TMemoryBuffer) {
      $msg = $out_transport->getBuffer();
      $out_transport->resetBuffer();
      list($result_msg, $_read_headers) = await $channel->genSendRequestResponse($rpc_options, $msg);
      $in_transport->resetBuffer();
      $in_transport->write($result_msg);
    } else {
      await $this->asyncHandler_->genWait($currentseqid);
    }
    $response = $this->recvImpl_func($currentseqid);
    await $this->asyncHandler_->genAfter();
    return $response;
  }

  /* send and recv functions */
  public function send_func(string $arg1, ?MyStruct $arg2): int {
    return $this->sendImpl_func($arg1, $arg2);
  }
  public function recv_func(?int $expectedsequenceid = null): int {
    return $this->recvImpl_func($expectedsequenceid);
  }
}

// HELPER FUNCTIONS AND STRUCTURES

class Service_func_args implements \IThriftStruct, \IThriftShapishStruct {
  use \ThriftSerializationTrait;

  const dict<int, this::TFieldSpec> SPEC = dict[
    1 => shape(
      'var' => 'arg1',
      'type' => \TType::STRING,
    ),
    2 => shape(
      'var' => 'arg2',
      'type' => \TType::STRUCT,
      'class' => MyStruct::class,
    ),
  ];
  const dict<string, int> FIELDMAP = dict[
    'arg1' => 1,
    'arg2' => 2,
  ];

  const type TConstructorShape = shape(
    ?'arg1' => ?string,
    ?'arg2' => ?MyStruct,
  );

  const type TShape = shape(
    'arg1' => string,
    ?'arg2' => ?MyStruct::TShape,
  );
  const int STRUCTURAL_ID = 6560600906529955702;
  public string $arg1;
  public ?MyStruct $arg2;

  public function __construct(?string $arg1 = null, ?MyStruct $arg2 = null  )[] {
    $this->arg1 = $arg1 ?? '';
    $this->arg2 = $arg2;
  }

  public static function withDefaultValues()[]: this {
    return new static();
  }

  public static function fromShape(self::TConstructorShape $shape)[]: this {
    return new static(
      Shapes::idx($shape, 'arg1'),
      Shapes::idx($shape, 'arg2'),
    );
  }

  public function getName()[]: string {
    return 'Service_func_args';
  }

  public static function getStructMetadata()[]: \tmeta_ThriftStruct {
    return tmeta_ThriftStruct::fromShape(
      shape(
        "name" => "module.func_args",
        "fields" => vec[
          tmeta_ThriftField::fromShape(
            shape(
              "id" => 1,
              "type" => tmeta_ThriftType::fromShape(
                shape(
                  "t_primitive" => tmeta_ThriftPrimitiveType::THRIFT_STRING_TYPE,
                )
              ),
              "name" => "arg1",
            )
          ),
          tmeta_ThriftField::fromShape(
            shape(
              "id" => 2,
              "type" => tmeta_ThriftType::fromShape(
                shape(
                  "t_struct" => tmeta_ThriftStructType::fromShape(
                    shape(
                      "name" => "module.MyStruct",
                    )
                  ),
                )
              ),
              "name" => "arg2",
            )
          ),
        ],
        "is_union" => false,
      )
    );
  }

  public static function getAllStructuredAnnotations()[]: \TStructAnnotations {
    return shape(
      'struct' => dict[],
      'fields' => dict[
      ],
    );
  }

  public static function __fromShape(self::TShape $shape)[]: this {
    return new static(
      $shape['arg1'],
      Shapes::idx($shape, 'arg2') === null ? null : (MyStruct::__fromShape($shape['arg2'])),
    );
  }

  public function __toShape()[]: self::TShape {
    return shape(
      'arg1' => $this->arg1,
      'arg2' => $this->arg2?->__toShape(),
    );
  }
  public function getInstanceKey()[write_props]: string {
    return \TCompactSerializer::serialize($this);
  }

  public function readFromJson(string $jsonText): void {
    $parsed = json_decode($jsonText, true);

    if ($parsed === null || !($parsed is KeyedContainer<_, _>)) {
      throw new \TProtocolException("Cannot parse the given json string.");
    }

    if (idx($parsed, 'arg1') !== null) {
      $this->arg1 = /* HH_FIXME[4110] */ $parsed['arg1'];
    }    
    if (idx($parsed, 'arg2') !== null) {
      $_tmp0 = json_encode(/* HH_FIXME[4110] */ $parsed['arg2']);
      $_tmp1 = MyStruct::withDefaultValues();
      $_tmp1->readFromJson($_tmp0);
      $this->arg2 = $_tmp1;
    }    
  }

}

class Service_func_result implements \IThriftStruct {
  use \ThriftSerializationTrait;

  const dict<int, this::TFieldSpec> SPEC = dict[
    0 => shape(
      'var' => 'success',
      'type' => \TType::I32,
    ),
  ];
  const dict<string, int> FIELDMAP = dict[
    'success' => 0,
  ];

  const type TConstructorShape = shape(
    ?'success' => ?int,
  );

  const int STRUCTURAL_ID = 3865318819874171525;
  public ?int $success;

  public function __construct(?int $success = null  )[] {
  }

  public static function withDefaultValues()[]: this {
    return new static();
  }

  public static function fromShape(self::TConstructorShape $shape)[]: this {
    return new static(
      Shapes::idx($shape, 'success'),
    );
  }

  public function getName()[]: string {
    return 'Service_func_result';
  }

  public static function getStructMetadata()[]: \tmeta_ThriftStruct {
    return tmeta_ThriftStruct::fromShape(
      shape(
        "name" => "module.Service_func_result",
        "fields" => vec[
          tmeta_ThriftField::fromShape(
            shape(
              "id" => 0,
              "type" => tmeta_ThriftType::fromShape(
                shape(
                  "t_primitive" => tmeta_ThriftPrimitiveType::THRIFT_I32_TYPE,
                )
              ),
              "name" => "success",
            )
          ),
        ],
        "is_union" => false,
      )
    );
  }

  public static function getAllStructuredAnnotations()[]: \TStructAnnotations {
    return shape(
      'struct' => dict[],
      'fields' => dict[
      ],
    );
  }

  public function getInstanceKey()[write_props]: string {
    return \TCompactSerializer::serialize($this);
  }

  public function readFromJson(string $jsonText): void {
    $parsed = json_decode($jsonText, true);

    if ($parsed === null || !($parsed is KeyedContainer<_, _>)) {
      throw new \TProtocolException("Cannot parse the given json string.");
    }

    if (idx($parsed, 'success') !== null) {
      $_tmp0 = (int)/* HH_FIXME[4110] */ $parsed['success'];
      if ($_tmp0 > 0x7fffffff) {
        throw new \TProtocolException("number exceeds limit in field");
      } else {
        $this->success = (int)$_tmp0;
      }
    }    
  }

}

class ServiceStaticMetadata implements \IThriftServiceStaticMetadata {
  public static function getServiceMetadata()[]: \tmeta_ThriftService {
    return tmeta_ThriftService::fromShape(
      shape(
        "name" => "module.Service",
        "functions" => vec[
          tmeta_ThriftFunction::fromShape(
            shape(
              "name" => "func",
              "return_type" => tmeta_ThriftType::fromShape(
                shape(
                  "t_primitive" => tmeta_ThriftPrimitiveType::THRIFT_I32_TYPE,
                )
              ),
              "arguments" => vec[
                tmeta_ThriftField::fromShape(
                  shape(
                    "id" => 1,
                    "type" => tmeta_ThriftType::fromShape(
                      shape(
                        "t_primitive" => tmeta_ThriftPrimitiveType::THRIFT_STRING_TYPE,
                      )
                    ),
                    "name" => "arg1",
                  )
                ),
                tmeta_ThriftField::fromShape(
                  shape(
                    "id" => 2,
                    "type" => tmeta_ThriftType::fromShape(
                      shape(
                        "t_struct" => tmeta_ThriftStructType::fromShape(
                          shape(
                            "name" => "module.MyStruct",
                          )
                        ),
                      )
                    ),
                    "name" => "arg2",
                  )
                ),
              ],
            )
          ),
        ],
      )
    );
  }

  public static function getServiceMetadataResponse()[]: \tmeta_ThriftServiceMetadataResponse {
    return \tmeta_ThriftServiceMetadataResponse::fromShape(
      shape(
        'context' => \tmeta_ThriftServiceContext::fromShape(
          shape(
            'service_info' => self::getServiceMetadata(),
            'module' => \tmeta_ThriftModuleContext::fromShape(
              shape(
                'name' => 'module',
              )
            ),
          )
        ),
        'metadata' => \tmeta_ThriftMetadata::fromShape(
          shape(
            'enums' => dict[
            ],
            'structs' => dict[
              'module.MyStruct' => MyStruct::getStructMetadata(),
            ],
            'exceptions' => dict[
            ],
            'services' => dict[
            ],
          )
        ),
      )
    );
  }

  public static function getAllStructuredAnnotations()[]: \TServiceAnnotations {
    return shape(
      'service' => dict[],
      'functions' => dict[
      ],
    );
  }
}

