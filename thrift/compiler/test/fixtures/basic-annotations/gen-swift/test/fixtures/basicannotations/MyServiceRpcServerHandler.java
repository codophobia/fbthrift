/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.basicannotations;

import java.util.*;
import org.apache.thrift.protocol.*;

public class MyServiceRpcServerHandler 
  implements com.facebook.thrift.server.RpcServerHandler {

  private final java.util.Map<String, com.facebook.thrift.server.RpcServerHandler> _methodMap;

  private final MyService.Reactive _delegate;

  private final java.util.List<com.facebook.thrift.payload.Reader> _pingReaders;
  private final java.util.List<com.facebook.thrift.payload.Reader> _getRandomDataReaders;
  private final java.util.List<com.facebook.thrift.payload.Reader> _hasDataByIdReaders;
  private final java.util.List<com.facebook.thrift.payload.Reader> _getDataByIdReaders;
  private final java.util.List<com.facebook.thrift.payload.Reader> _putDataByIdReaders;
  private final java.util.List<com.facebook.thrift.payload.Reader> _lobDataByIdReaders;
  private final java.util.List<com.facebook.thrift.payload.Reader> _doNothingReaders;

  private final java.util.List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers;

  public MyServiceRpcServerHandler(MyService _delegate,
                                    java.util.List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {
    this(new MyServiceBlockingReactiveWrapper(_delegate), _eventHandlers);
  }

  public MyServiceRpcServerHandler(MyService.Async _delegate,
                                    java.util.List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {
    this(new MyServiceAsyncReactiveWrapper(_delegate), _eventHandlers);
  }

  public MyServiceRpcServerHandler(MyService.Reactive _delegate,
                                    java.util.List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {
    
    this._methodMap = new java.util.HashMap<>();
    this._delegate = _delegate;
    this._eventHandlers = _eventHandlers;

    _methodMap.put("ping", this);
    _pingReaders = _create_ping_request_readers();

    _methodMap.put("getRandomData", this);
    _getRandomDataReaders = _create_getRandomData_request_readers();

    _methodMap.put("hasDataById", this);
    _hasDataByIdReaders = _create_hasDataById_request_readers();

    _methodMap.put("getDataById", this);
    _getDataByIdReaders = _create_getDataById_request_readers();

    _methodMap.put("putDataById", this);
    _putDataByIdReaders = _create_putDataById_request_readers();

    _methodMap.put("lobDataById", this);
    _lobDataByIdReaders = _create_lobDataById_request_readers();

    _methodMap.put("doNothing", this);
    _doNothingReaders = _create_doNothing_request_readers();

  }

  private static java.util.List<com.facebook.thrift.payload.Reader> _create_ping_request_readers() {
    java.util.List<com.facebook.thrift.payload.Reader> _readerList = new java.util.ArrayList<>();


    return _readerList;
  }

  private static com.facebook.thrift.payload.Writer _create_ping_response_writer(
      final Object _r,
      final com.facebook.swift.service.ContextChain _chain,
      final int _seqId) {
      return oprot -> {
      try {
        oprot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("ping", TMessageType.REPLY, _seqId));
        oprot.writeStructBegin(com.facebook.thrift.util.GeneratedUtil.TSTRUCT);

        

        oprot.writeFieldBegin(com.facebook.thrift.util.GeneratedUtil.VOID_FIELD);


        oprot.writeFieldEnd();
        oprot.writeFieldStop();
        oprot.writeStructEnd();
        oprot.writeMessageEnd();

        _chain.postWrite(_r);
      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  }


  private static reactor.core.publisher.Mono<com.facebook.thrift.payload.ServerResponsePayload>
    _doping(
    MyService.Reactive _delegate,
    String _name,
    com.facebook.thrift.payload.ServerRequestPayload _payload,
    java.util.List<com.facebook.thrift.payload.Reader> _readers,
    java.util.List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {
    final com.facebook.swift.service.ContextChain _chain = new com.facebook.swift.service.ContextChain(_eventHandlers, _name, _payload.getRequestContext());
          _chain.preRead();
          java.util.List<Object>_data = _payload.getData(_readers);
          java.util.Iterator<Object> _iterator = _data.iterator();


          _chain.postRead(_data);

          reactor.core.publisher.Mono<com.facebook.thrift.payload.ServerResponsePayload> _internalResponse =
            _delegate
            .ping()
            .map(_response -> {
              _chain.preWrite(_response);
              com.facebook.thrift.payload.ServerResponsePayload _serverResponsePayload =
                com.facebook.thrift.util.GeneratedUtil.createServerResponsePayload(
                  _payload,
                  _create_ping_response_writer(_response, _chain, _payload.getMessageSeqId()));

                return _serverResponsePayload;
            })
            .<com.facebook.thrift.payload.ServerResponsePayload>onErrorResume(_t -> {
                _chain.preWriteException(_t);
                com.facebook.thrift.payload.Writer _exceptionWriter = null;


                com.facebook.thrift.payload.ServerResponsePayload _serverResponsePayload =
                    com.facebook.thrift.util.GeneratedUtil.createServerResponsePayload(
                        _payload,
                        _exceptionWriter);

                return reactor.core.publisher.Mono.just(_serverResponsePayload);
            });
          if (com.facebook.thrift.util.resources.RpcResources.isForceExecutionOffEventLoop()) {
            _internalResponse = _internalResponse.publishOn(com.facebook.thrift.util.resources.RpcResources.getOffLoopScheduler());
          }

          return _internalResponse;
  }
  private static java.util.List<com.facebook.thrift.payload.Reader> _create_getRandomData_request_readers() {
    java.util.List<com.facebook.thrift.payload.Reader> _readerList = new java.util.ArrayList<>();


    return _readerList;
  }

  private static com.facebook.thrift.payload.Writer _create_getRandomData_response_writer(
      final Object _r,
      final com.facebook.swift.service.ContextChain _chain,
      final int _seqId) {
      return oprot -> {
      try {
        oprot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("getRandomData", TMessageType.REPLY, _seqId));
        oprot.writeStructBegin(com.facebook.thrift.util.GeneratedUtil.TSTRUCT);

        
        String _iter0 = (String)_r;
        oprot.writeFieldBegin(com.facebook.thrift.util.GeneratedUtil.STRING_FIELD);
oprot.writeString(_iter0);



        oprot.writeFieldEnd();
        oprot.writeFieldStop();
        oprot.writeStructEnd();
        oprot.writeMessageEnd();

        _chain.postWrite(_r);
      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  }


  private static reactor.core.publisher.Mono<com.facebook.thrift.payload.ServerResponsePayload>
    _dogetRandomData(
    MyService.Reactive _delegate,
    String _name,
    com.facebook.thrift.payload.ServerRequestPayload _payload,
    java.util.List<com.facebook.thrift.payload.Reader> _readers,
    java.util.List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {
    final com.facebook.swift.service.ContextChain _chain = new com.facebook.swift.service.ContextChain(_eventHandlers, _name, _payload.getRequestContext());
          _chain.preRead();
          java.util.List<Object>_data = _payload.getData(_readers);
          java.util.Iterator<Object> _iterator = _data.iterator();


          _chain.postRead(_data);

          reactor.core.publisher.Mono<com.facebook.thrift.payload.ServerResponsePayload> _internalResponse =
            _delegate
            .getRandomData()
            .map(_response -> {
              _chain.preWrite(_response);
              com.facebook.thrift.payload.ServerResponsePayload _serverResponsePayload =
                com.facebook.thrift.util.GeneratedUtil.createServerResponsePayload(
                  _payload,
                  _create_getRandomData_response_writer(_response, _chain, _payload.getMessageSeqId()));

                return _serverResponsePayload;
            })
            .<com.facebook.thrift.payload.ServerResponsePayload>onErrorResume(_t -> {
                _chain.preWriteException(_t);
                com.facebook.thrift.payload.Writer _exceptionWriter = null;


                com.facebook.thrift.payload.ServerResponsePayload _serverResponsePayload =
                    com.facebook.thrift.util.GeneratedUtil.createServerResponsePayload(
                        _payload,
                        _exceptionWriter);

                return reactor.core.publisher.Mono.just(_serverResponsePayload);
            });
          if (com.facebook.thrift.util.resources.RpcResources.isForceExecutionOffEventLoop()) {
            _internalResponse = _internalResponse.publishOn(com.facebook.thrift.util.resources.RpcResources.getOffLoopScheduler());
          }

          return _internalResponse;
  }
  private static java.util.List<com.facebook.thrift.payload.Reader> _create_hasDataById_request_readers() {
    java.util.List<com.facebook.thrift.payload.Reader> _readerList = new java.util.ArrayList<>();

    
    _readerList.add(oprot -> {
      try {
        long _r = oprot.readI64();
        return _r;

      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    });

    return _readerList;
  }

  private static com.facebook.thrift.payload.Writer _create_hasDataById_response_writer(
      final Object _r,
      final com.facebook.swift.service.ContextChain _chain,
      final int _seqId) {
      return oprot -> {
      try {
        oprot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("hasDataById", TMessageType.REPLY, _seqId));
        oprot.writeStructBegin(com.facebook.thrift.util.GeneratedUtil.TSTRUCT);

        
        boolean _iter0 = (boolean)_r;
        oprot.writeFieldBegin(com.facebook.thrift.util.GeneratedUtil.BOOL_FIELD);
oprot.writeBool(_iter0);



        oprot.writeFieldEnd();
        oprot.writeFieldStop();
        oprot.writeStructEnd();
        oprot.writeMessageEnd();

        _chain.postWrite(_r);
      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  }


  private static reactor.core.publisher.Mono<com.facebook.thrift.payload.ServerResponsePayload>
    _dohasDataById(
    MyService.Reactive _delegate,
    String _name,
    com.facebook.thrift.payload.ServerRequestPayload _payload,
    java.util.List<com.facebook.thrift.payload.Reader> _readers,
    java.util.List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {
    final com.facebook.swift.service.ContextChain _chain = new com.facebook.swift.service.ContextChain(_eventHandlers, _name, _payload.getRequestContext());
          _chain.preRead();
          java.util.List<Object>_data = _payload.getData(_readers);
          java.util.Iterator<Object> _iterator = _data.iterator();

          long id = (long) _iterator.next();

          _chain.postRead(_data);

          reactor.core.publisher.Mono<com.facebook.thrift.payload.ServerResponsePayload> _internalResponse =
            _delegate
            .hasDataById(id)
            .map(_response -> {
              _chain.preWrite(_response);
              com.facebook.thrift.payload.ServerResponsePayload _serverResponsePayload =
                com.facebook.thrift.util.GeneratedUtil.createServerResponsePayload(
                  _payload,
                  _create_hasDataById_response_writer(_response, _chain, _payload.getMessageSeqId()));

                return _serverResponsePayload;
            })
            .<com.facebook.thrift.payload.ServerResponsePayload>onErrorResume(_t -> {
                _chain.preWriteException(_t);
                com.facebook.thrift.payload.Writer _exceptionWriter = null;


                com.facebook.thrift.payload.ServerResponsePayload _serverResponsePayload =
                    com.facebook.thrift.util.GeneratedUtil.createServerResponsePayload(
                        _payload,
                        _exceptionWriter);

                return reactor.core.publisher.Mono.just(_serverResponsePayload);
            });
          if (com.facebook.thrift.util.resources.RpcResources.isForceExecutionOffEventLoop()) {
            _internalResponse = _internalResponse.publishOn(com.facebook.thrift.util.resources.RpcResources.getOffLoopScheduler());
          }

          return _internalResponse;
  }
  private static java.util.List<com.facebook.thrift.payload.Reader> _create_getDataById_request_readers() {
    java.util.List<com.facebook.thrift.payload.Reader> _readerList = new java.util.ArrayList<>();

    
    _readerList.add(oprot -> {
      try {
        long _r = oprot.readI64();
        return _r;

      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    });

    return _readerList;
  }

  private static com.facebook.thrift.payload.Writer _create_getDataById_response_writer(
      final Object _r,
      final com.facebook.swift.service.ContextChain _chain,
      final int _seqId) {
      return oprot -> {
      try {
        oprot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("getDataById", TMessageType.REPLY, _seqId));
        oprot.writeStructBegin(com.facebook.thrift.util.GeneratedUtil.TSTRUCT);

        
        String _iter0 = (String)_r;
        oprot.writeFieldBegin(com.facebook.thrift.util.GeneratedUtil.STRING_FIELD);
oprot.writeString(_iter0);



        oprot.writeFieldEnd();
        oprot.writeFieldStop();
        oprot.writeStructEnd();
        oprot.writeMessageEnd();

        _chain.postWrite(_r);
      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  }


  private static reactor.core.publisher.Mono<com.facebook.thrift.payload.ServerResponsePayload>
    _dogetDataById(
    MyService.Reactive _delegate,
    String _name,
    com.facebook.thrift.payload.ServerRequestPayload _payload,
    java.util.List<com.facebook.thrift.payload.Reader> _readers,
    java.util.List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {
    final com.facebook.swift.service.ContextChain _chain = new com.facebook.swift.service.ContextChain(_eventHandlers, _name, _payload.getRequestContext());
          _chain.preRead();
          java.util.List<Object>_data = _payload.getData(_readers);
          java.util.Iterator<Object> _iterator = _data.iterator();

          long id = (long) _iterator.next();

          _chain.postRead(_data);

          reactor.core.publisher.Mono<com.facebook.thrift.payload.ServerResponsePayload> _internalResponse =
            _delegate
            .getDataById(id)
            .map(_response -> {
              _chain.preWrite(_response);
              com.facebook.thrift.payload.ServerResponsePayload _serverResponsePayload =
                com.facebook.thrift.util.GeneratedUtil.createServerResponsePayload(
                  _payload,
                  _create_getDataById_response_writer(_response, _chain, _payload.getMessageSeqId()));

                return _serverResponsePayload;
            })
            .<com.facebook.thrift.payload.ServerResponsePayload>onErrorResume(_t -> {
                _chain.preWriteException(_t);
                com.facebook.thrift.payload.Writer _exceptionWriter = null;


                com.facebook.thrift.payload.ServerResponsePayload _serverResponsePayload =
                    com.facebook.thrift.util.GeneratedUtil.createServerResponsePayload(
                        _payload,
                        _exceptionWriter);

                return reactor.core.publisher.Mono.just(_serverResponsePayload);
            });
          if (com.facebook.thrift.util.resources.RpcResources.isForceExecutionOffEventLoop()) {
            _internalResponse = _internalResponse.publishOn(com.facebook.thrift.util.resources.RpcResources.getOffLoopScheduler());
          }

          return _internalResponse;
  }
  private static java.util.List<com.facebook.thrift.payload.Reader> _create_putDataById_request_readers() {
    java.util.List<com.facebook.thrift.payload.Reader> _readerList = new java.util.ArrayList<>();

    
    _readerList.add(oprot -> {
      try {
        long _r = oprot.readI64();
        return _r;

      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    });
    
    _readerList.add(oprot -> {
      try {
        String _r = oprot.readString();
        return _r;

      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    });

    return _readerList;
  }

  private static com.facebook.thrift.payload.Writer _create_putDataById_response_writer(
      final Object _r,
      final com.facebook.swift.service.ContextChain _chain,
      final int _seqId) {
      return oprot -> {
      try {
        oprot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("putDataById", TMessageType.REPLY, _seqId));
        oprot.writeStructBegin(com.facebook.thrift.util.GeneratedUtil.TSTRUCT);

        

        oprot.writeFieldBegin(com.facebook.thrift.util.GeneratedUtil.VOID_FIELD);


        oprot.writeFieldEnd();
        oprot.writeFieldStop();
        oprot.writeStructEnd();
        oprot.writeMessageEnd();

        _chain.postWrite(_r);
      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  }


  private static reactor.core.publisher.Mono<com.facebook.thrift.payload.ServerResponsePayload>
    _doputDataById(
    MyService.Reactive _delegate,
    String _name,
    com.facebook.thrift.payload.ServerRequestPayload _payload,
    java.util.List<com.facebook.thrift.payload.Reader> _readers,
    java.util.List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {
    final com.facebook.swift.service.ContextChain _chain = new com.facebook.swift.service.ContextChain(_eventHandlers, _name, _payload.getRequestContext());
          _chain.preRead();
          java.util.List<Object>_data = _payload.getData(_readers);
          java.util.Iterator<Object> _iterator = _data.iterator();

          long id = (long) _iterator.next();
          String data = (String) _iterator.next();

          _chain.postRead(_data);

          reactor.core.publisher.Mono<com.facebook.thrift.payload.ServerResponsePayload> _internalResponse =
            _delegate
            .putDataById(id, data)
            .map(_response -> {
              _chain.preWrite(_response);
              com.facebook.thrift.payload.ServerResponsePayload _serverResponsePayload =
                com.facebook.thrift.util.GeneratedUtil.createServerResponsePayload(
                  _payload,
                  _create_putDataById_response_writer(_response, _chain, _payload.getMessageSeqId()));

                return _serverResponsePayload;
            })
            .<com.facebook.thrift.payload.ServerResponsePayload>onErrorResume(_t -> {
                _chain.preWriteException(_t);
                com.facebook.thrift.payload.Writer _exceptionWriter = null;


                com.facebook.thrift.payload.ServerResponsePayload _serverResponsePayload =
                    com.facebook.thrift.util.GeneratedUtil.createServerResponsePayload(
                        _payload,
                        _exceptionWriter);

                return reactor.core.publisher.Mono.just(_serverResponsePayload);
            });
          if (com.facebook.thrift.util.resources.RpcResources.isForceExecutionOffEventLoop()) {
            _internalResponse = _internalResponse.publishOn(com.facebook.thrift.util.resources.RpcResources.getOffLoopScheduler());
          }

          return _internalResponse;
  }
  private static java.util.List<com.facebook.thrift.payload.Reader> _create_lobDataById_request_readers() {
    java.util.List<com.facebook.thrift.payload.Reader> _readerList = new java.util.ArrayList<>();

    
    _readerList.add(oprot -> {
      try {
        long _r = oprot.readI64();
        return _r;

      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    });
    
    _readerList.add(oprot -> {
      try {
        String _r = oprot.readString();
        return _r;

      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    });

    return _readerList;
  }

  private static com.facebook.thrift.payload.Writer _create_lobDataById_response_writer(
      final Object _r,
      final com.facebook.swift.service.ContextChain _chain,
      final int _seqId) {
      return oprot -> {
      try {
        oprot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("lobDataById", TMessageType.REPLY, _seqId));
        oprot.writeStructBegin(com.facebook.thrift.util.GeneratedUtil.TSTRUCT);

        

        oprot.writeFieldBegin(com.facebook.thrift.util.GeneratedUtil.VOID_FIELD);


        oprot.writeFieldEnd();
        oprot.writeFieldStop();
        oprot.writeStructEnd();
        oprot.writeMessageEnd();

        _chain.postWrite(_r);
      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  }


  private static reactor.core.publisher.Mono<com.facebook.thrift.payload.ServerResponsePayload>
    _dolobDataById(
    MyService.Reactive _delegate,
    String _name,
    com.facebook.thrift.payload.ServerRequestPayload _payload,
    java.util.List<com.facebook.thrift.payload.Reader> _readers,
    java.util.List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {
    final com.facebook.swift.service.ContextChain _chain = new com.facebook.swift.service.ContextChain(_eventHandlers, _name, _payload.getRequestContext());
          _chain.preRead();
          java.util.List<Object>_data = _payload.getData(_readers);
          java.util.Iterator<Object> _iterator = _data.iterator();

          long id = (long) _iterator.next();
          String data = (String) _iterator.next();

          _chain.postRead(_data);

          reactor.core.publisher.Mono<com.facebook.thrift.payload.ServerResponsePayload> _internalResponse =
            _delegate
            .lobDataById(id, data)
            .map(_response -> {
              _chain.preWrite(_response);
              com.facebook.thrift.payload.ServerResponsePayload _serverResponsePayload =
                com.facebook.thrift.util.GeneratedUtil.createServerResponsePayload(
                  _payload,
                  _create_lobDataById_response_writer(_response, _chain, _payload.getMessageSeqId()));

                return _serverResponsePayload;
            })
            .<com.facebook.thrift.payload.ServerResponsePayload>onErrorResume(_t -> {
                _chain.preWriteException(_t);
                com.facebook.thrift.payload.Writer _exceptionWriter = null;


                com.facebook.thrift.payload.ServerResponsePayload _serverResponsePayload =
                    com.facebook.thrift.util.GeneratedUtil.createServerResponsePayload(
                        _payload,
                        _exceptionWriter);

                return reactor.core.publisher.Mono.just(_serverResponsePayload);
            });
          if (com.facebook.thrift.util.resources.RpcResources.isForceExecutionOffEventLoop()) {
            _internalResponse = _internalResponse.publishOn(com.facebook.thrift.util.resources.RpcResources.getOffLoopScheduler());
          }

          return _internalResponse;
  }
  private static java.util.List<com.facebook.thrift.payload.Reader> _create_doNothing_request_readers() {
    java.util.List<com.facebook.thrift.payload.Reader> _readerList = new java.util.ArrayList<>();


    return _readerList;
  }

  private static com.facebook.thrift.payload.Writer _create_doNothing_response_writer(
      final Object _r,
      final com.facebook.swift.service.ContextChain _chain,
      final int _seqId) {
      return oprot -> {
      try {
        oprot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("doNothing", TMessageType.REPLY, _seqId));
        oprot.writeStructBegin(com.facebook.thrift.util.GeneratedUtil.TSTRUCT);

        

        oprot.writeFieldBegin(com.facebook.thrift.util.GeneratedUtil.VOID_FIELD);


        oprot.writeFieldEnd();
        oprot.writeFieldStop();
        oprot.writeStructEnd();
        oprot.writeMessageEnd();

        _chain.postWrite(_r);
      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  }


  private static reactor.core.publisher.Mono<com.facebook.thrift.payload.ServerResponsePayload>
    _dodoNothing(
    MyService.Reactive _delegate,
    String _name,
    com.facebook.thrift.payload.ServerRequestPayload _payload,
    java.util.List<com.facebook.thrift.payload.Reader> _readers,
    java.util.List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {
    final com.facebook.swift.service.ContextChain _chain = new com.facebook.swift.service.ContextChain(_eventHandlers, _name, _payload.getRequestContext());
          _chain.preRead();
          java.util.List<Object>_data = _payload.getData(_readers);
          java.util.Iterator<Object> _iterator = _data.iterator();


          _chain.postRead(_data);

          reactor.core.publisher.Mono<com.facebook.thrift.payload.ServerResponsePayload> _internalResponse =
            _delegate
            .doNothing()
            .map(_response -> {
              _chain.preWrite(_response);
              com.facebook.thrift.payload.ServerResponsePayload _serverResponsePayload =
                com.facebook.thrift.util.GeneratedUtil.createServerResponsePayload(
                  _payload,
                  _create_doNothing_response_writer(_response, _chain, _payload.getMessageSeqId()));

                return _serverResponsePayload;
            })
            .<com.facebook.thrift.payload.ServerResponsePayload>onErrorResume(_t -> {
                _chain.preWriteException(_t);
                com.facebook.thrift.payload.Writer _exceptionWriter = null;


                com.facebook.thrift.payload.ServerResponsePayload _serverResponsePayload =
                    com.facebook.thrift.util.GeneratedUtil.createServerResponsePayload(
                        _payload,
                        _exceptionWriter);

                return reactor.core.publisher.Mono.just(_serverResponsePayload);
            });
          if (com.facebook.thrift.util.resources.RpcResources.isForceExecutionOffEventLoop()) {
            _internalResponse = _internalResponse.publishOn(com.facebook.thrift.util.resources.RpcResources.getOffLoopScheduler());
          }

          return _internalResponse;
  }

  @Override
  public reactor.core.publisher.Mono<com.facebook.thrift.payload.ServerResponsePayload> singleRequestSingleResponse(com.facebook.thrift.payload.ServerRequestPayload _payload) {
    final String _name = _payload.getRequestRpcMetadata().getName();

    reactor.core.publisher.Mono<com.facebook.thrift.payload.ServerResponsePayload> _result;
    try {
      switch (_name) {
        case "ping":
          _result = _doping(_delegate, _name, _payload, _pingReaders, _eventHandlers);
        break;
        case "getRandomData":
          _result = _dogetRandomData(_delegate, _name, _payload, _getRandomDataReaders, _eventHandlers);
        break;
        case "hasDataById":
          _result = _dohasDataById(_delegate, _name, _payload, _hasDataByIdReaders, _eventHandlers);
        break;
        case "getDataById":
          _result = _dogetDataById(_delegate, _name, _payload, _getDataByIdReaders, _eventHandlers);
        break;
        case "putDataById":
          _result = _doputDataById(_delegate, _name, _payload, _putDataByIdReaders, _eventHandlers);
        break;
        case "lobDataById":
          _result = _dolobDataById(_delegate, _name, _payload, _lobDataByIdReaders, _eventHandlers);
        break;
        case "doNothing":
          _result = _dodoNothing(_delegate, _name, _payload, _doNothingReaders, _eventHandlers);
        break;
        default: {
          _result = reactor.core.publisher.Mono.error(new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.UNKNOWN_METHOD, "no method found with name " + _name));
        }
      }
    } catch (Throwable _t) {
      _result = reactor.core.publisher.Mono.error(_t);
    }

    return _result;
  }

  public java.util.Map<String, com.facebook.thrift.server.RpcServerHandler> getMethodMap() {
      return _methodMap;
  }

}
